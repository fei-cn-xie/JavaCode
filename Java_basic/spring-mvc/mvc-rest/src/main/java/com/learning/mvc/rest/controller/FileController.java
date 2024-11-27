package com.learning.mvc.rest.controller;

import jakarta.servlet.ServletContext;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpSession;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.util.MultiValueMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.DispatcherServlet;

import javax.swing.plaf.multi.MultiViewportUI;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * Author fei
 * Version 1.0
 * Description TODO
 * DATA 2024/11/25  16:03
 */
@RestController
public class FileController {



    @RequestMapping("/testDown")
    public ResponseEntity<byte[]> testDown(HttpSession session) throws IOException {
        ServletContext servletContext = session.getServletContext();
        String realPath = servletContext.getRealPath("/static/img/a.png");
        FileInputStream fileInputStream = new FileInputStream(realPath);
        byte[] bytes = new byte[fileInputStream.available()];
        fileInputStream.read(bytes);
        MultiValueMap<String, String> httpHeaders = new HttpHeaders();
        httpHeaders.add("Content-Disposition", "attachment; filename=a.png");
        HttpStatus httpStatus = HttpStatus.OK;
        ResponseEntity<byte[]> responseEntity = new ResponseEntity<>(bytes, httpHeaders, httpStatus);
        fileInputStream.close();
        return responseEntity;


    }


    @RequestMapping(value = "/testUp", method = RequestMethod.POST)
    public String testUp(@RequestParam("photo") MultipartFile photo, HttpSession session) throws IOException {
        System.out.println(photo.getOriginalFilename());
        System.out.println(photo.getName());
        ServletContext servletContext = session.getServletContext();
        String realPath = servletContext.getRealPath("photo");
        File file = new File(realPath);
        if (!file.exists()) {
            file.mkdirs();
        }
        String finalPath = realPath + File.separator + photo.getOriginalFilename();
        photo.transferTo(new File(finalPath));
        return "testUP 成功";
    }
}
