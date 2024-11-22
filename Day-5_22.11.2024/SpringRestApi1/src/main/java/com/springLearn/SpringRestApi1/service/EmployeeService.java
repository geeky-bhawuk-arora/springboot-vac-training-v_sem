package com.springLearn.SpringRestApi1.service;

import com.springLearn.SpringRestApi1.model.Employee;

import java.util.List;

public interface EmployeeService {
    List<Employee> getAllEmployees();

    Employee getEmployeeById(Integer empId);

    Employee saveEmployee(Employee employee);

    Employee updateEmployee(Integer empId, Employee employee);

    void deleteEmployee(Integer empId);
}
