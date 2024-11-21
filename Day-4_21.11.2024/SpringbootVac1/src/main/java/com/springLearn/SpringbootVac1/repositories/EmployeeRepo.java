package com.springLearn.SpringbootVac1.repositories;

import com.springLearn.SpringbootVac1.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeRepo extends JpaRepository<Employee, Integer> {
    
}
