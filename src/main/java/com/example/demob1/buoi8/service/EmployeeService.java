package com.example.demob1.buoi8.service;

import com.example.demob1.buoi8.entity.Employee;
import org.springframework.stereotype.Service;
import java.util.Arrays;
import java.util.List;

@Service
public class EmployeeService {
    private List<Employee> employees = Arrays.asList(new Employee("aaa"));

    public List<Employee> getEmployees() {
        return employees;
    }
}
