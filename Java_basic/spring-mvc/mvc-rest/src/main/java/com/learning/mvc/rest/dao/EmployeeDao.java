package com.learning.mvc.rest.dao;

import com.learning.mvc.rest.bean.Employee;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Author fei
 * Version 1.0
 * Description TODO
 * DATA 2024/11/24  22:42
 */
@Repository
public class EmployeeDao {
    private static Map<Integer, Employee> map = new HashMap<>();
    private static Integer initId = 1004;
    static {
        map.put(initId, new Employee("email1", 0, initId, "lisa"));
        map.put(++initId, new Employee("email2", 1, initId, "tom"));
        map.put(++initId, new Employee("email3", 1, initId, "jerry"));


    }

    public void save(Employee employee) {
        if(employee != null && employee.getId() == null) {
            employee.setId(initId++);
        }
        map.put(employee.getId(), employee);
    }
    public Employee get(Integer id) {
        return map.get(id);
    }
    public List<Employee> getAll() {
        return new ArrayList<>(map.values());
    }

    public void update(Employee employee) {
        map.put(employee.getId(), employee);
    }

    public void delete(Integer id) {
        map.remove(id);
    }
}
