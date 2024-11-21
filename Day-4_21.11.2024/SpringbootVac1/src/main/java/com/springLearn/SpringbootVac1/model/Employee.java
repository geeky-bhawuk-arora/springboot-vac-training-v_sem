package com.springLearn.SpringbootVac1.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "employee_data")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Employee {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int empId;

    @Column(nullable = false, length = 50)
    private String empName;

    @Column(nullable = false)
    private double empSal;

}
