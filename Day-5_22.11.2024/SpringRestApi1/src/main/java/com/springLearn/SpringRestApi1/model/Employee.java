package com.springLearn.SpringRestApi1.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;

@Entity
@Table(name = "employee_data_2") // Maps to "employee_data_2" table in the database
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Employee {

    @Id
    private Integer empId; // Primary key for the table

    private String empName; // Changed from Integer to String for a name

    private String empEmail;

    private Double empSal;

    private String company;

    private String designation;
}
