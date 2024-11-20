package com.learning.bean;

import com.learning.anno.Bean;
import com.learning.anno.DI;
import org.springframework.context.ApplicationContext;

import java.io.File;
import java.io.IOException;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.net.URL;
import java.net.URLDecoder;
import java.nio.charset.StandardCharsets;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * @Author fei
 * @Version 1.0
 * @Description 在spring中, IOC创建的对象都放在了一个Map的集合中, 这里做复现
 * @DATA 2024/11/19  15:31
 */
public class MyAnnotationApplicationContext implements MyApplicationContext {

    //创建一个Map集合, 用于存放bean的实例对象
    Map<Class,Object> beans = new HashMap<>();
    private String rootPath;


    //返回对象
    @Override
    public Object getBean(Class clazz) {
        return beans.get(clazz);
    }

    public MyAnnotationApplicationContext() {}

    //设置包的扫描规则
    //当前包或者子包,如果类上有@Bean注解, 则通过反射将其实例化
    //创建有参数的构造,传递包的路径
    public MyAnnotationApplicationContext(String basePackage) throws IOException, ClassNotFoundException, InvocationTargetException, NoSuchMethodException, InstantiationException, IllegalAccessException {
        String packagePath = basePackage.replaceAll("\\.", "/");
        System.out.println(packagePath);
        Enumeration<URL> resources = Thread.currentThread().getContextClassLoader().getResources(packagePath);
        while (resources.hasMoreElements()) {
            URL url = resources.nextElement();
            String filePath = URLDecoder.decode(url.getFile(), StandardCharsets.UTF_8);
            rootPath = filePath.substring(0, filePath.length() - packagePath.length());
            System.out.println("rootPath = " + rootPath);
            //包扫描
            System.out.println("filePath = " + filePath);
            loadBean(new File(filePath));
            loadDI();
        }

    }

    private void loadBean(File file) throws ClassNotFoundException, NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
        if (file.isDirectory()) {
            File[] childrenFiles = file.listFiles();
            if(childrenFiles == null && childrenFiles.length > 0) {
                return;
            }
            for (File childFile : childrenFiles) {
                if (childFile.isDirectory()) {
                    loadBean(childFile);
                }else {
                    //得到包路径
                    String pathWithClass = childFile.getAbsolutePath().substring(rootPath.length());
                    if(pathWithClass.contains(".class")) {

                        //得到com.learning.service.UserServiceImpl
                        String allName = pathWithClass.replaceAll("/", ".")
                                .replaceAll(".class", "");
                        System.out.println("all name is = " + allName);

                        Class<?> aClass = Class.forName(allName);
                        if(!aClass.isInterface()) {
                            if(aClass.getAnnotation(Bean.class) != null){
                                Object instance = aClass.getConstructor().newInstance();
                                beans.put(aClass,instance);
                            }
                        }

                    }
                }
            }
        }


    }

    private void loadDI(){
        Set<Map.Entry<Class, Object>> entries = beans.entrySet();
        for (Map.Entry<Class, Object> entry : entries) {
            Object obj = entry.getValue();
            Class<?> aClass = obj.getClass();
            Field[] fields = aClass.getDeclaredFields();
            for (Field field : fields) {
                DI annotation = field.getAnnotation(DI.class);
                if(annotation != null) {
                    field.setAccessible(true);
                    try {
                        field.set(obj, beans.get(field.getType()));
                    } catch (IllegalAccessException e) {
                        throw new RuntimeException(e);
                    }
                }
            }
        }

    }
}
