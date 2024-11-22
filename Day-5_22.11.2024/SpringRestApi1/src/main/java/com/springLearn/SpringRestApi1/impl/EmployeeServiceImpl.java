package com.springLearn.SpringRestApi1.impl;

import com.springLearn.SpringRestApi1.model.Employee;
import com.springLearn.SpringRestApi1.repositories.EmployeeRepo;
import com.springLearn.SpringRestApi1.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeServiceImpl implements EmployeeService {

    @Autowired
    private EmployeeRepo employeeRepo;

    @Override
    public List<Employee> getAllEmployees() {
        return employeeRepo.findAll();
    }

    @Override
    public Employee getEmployeeById(Integer empId) {
        return employeeRepo.findById(empId)
                .orElseThrow(() -> new RuntimeException("Employee not found with ID: " + empId));
    }

    @Override
    public Employee saveEmployee(Employee employee) {
        return employeeRepo.save(employee);
    }

    @Override
    public Employee updateEmployee(Integer empId, Employee employeeDetails) {
        Employee existingEmployee = getEmployeeById(empId);

        existingEmployee.setEmpName(employeeDetails.getEmpName());
        existingEmployee.setEmpEmail(employeeDetails.getEmpEmail());
        existingEmployee.setEmpSal(employeeDetails.getEmpSal());
        existingEmployee.setCompany(employeeDetails.getCompany());
        existingEmployee.setDesignation(employeeDetails.getDesignation());

        return employeeRepo.save(existingEmployee);
    }

    @Override
    public void deleteEmployee(Integer empId) {
        Employee existingEmployee = getEmployeeById(empId);
        employeeRepo.delete(existingEmployee);
    }
}
