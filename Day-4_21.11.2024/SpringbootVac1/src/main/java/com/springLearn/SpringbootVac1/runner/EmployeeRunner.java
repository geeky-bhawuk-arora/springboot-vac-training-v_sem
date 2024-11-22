package com.springLearn.SpringbootVac1.runner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.springLearn.SpringbootVac1.model.Employee;
import com.springLearn.SpringbootVac1.repositories.EmployeeRepo;

import java.util.List;
import java.util.Optional;

@Component
public class EmployeeRunner implements CommandLineRunner {

    @Autowired
    private EmployeeRepo repository;
 
    @Override
    public void run(String... args) throws Exception {
        // Add records
        repository.save(new Employee(1, "Bhawuk", 100000.0));
        repository.save(new Employee(2, "Kanishk", 90000.0));
        repository.save(new Employee(3, "Aarav", 120000.0));

        System.out.println("Records added!");

        // Get all records
        List<Employee> employees = repository.findAll();
        System.out.println("All Employees:");
        employees.forEach(System.out::println);

        // Find a specific record by ID
        Optional<Employee> emp = repository.findById(2);
        emp.ifPresent(employee -> System.out.println("Employee with ID 2: " + employee));

        // Update a record
        if (emp.isPresent()) {
            Employee e = emp.get();
            e.setEmpSal(95000.0);
            repository.save(e); 
            System.out.println("Updated Employee with ID 2: " + e);
        }

        // Delete a record by ID
        // repository.deleteById(3);
        // System.out.println("Deleted Employee with ID 3");
    }
}
