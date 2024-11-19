package com.springLearning;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class StudentDaoImpl implements StudentDao {
    
//    private static final String CREATE_STUDENT_TABLE = 
//        "CREATE TABLE IF NOT EXISTS students (id INT AUTO_INCREMENT PRIMARY KEY, name VARCHAR(100) NOT NULL, age INT, class VARCHAR(50));";
    
    private static final String INSERT_DATA = 
//        "INSERT INTO students (name, age, class) VALUES ('Alice Smith', 22, '12th Grade'), ('Bob Johnson', 20, '11th Grade'), ('Charlie Brown', 19, '10th Grade');";
    "INSERT INTO students (name, age, class) VALUES ('David Wilson', 21, '12th Grade'), ('Eve Adams', 18, '9th Grade'), ('Frank Taylor', 23, '12th Grade'), ('Grace Lee', 17, '8th Grade'), ('Hannah Scott', 20, '11th Grade'), ('Ian Harris', 22, '12th Grade'), ('Jack Green', 19, '10th Grade'), ('Laura White', 18, '9th Grade'), ('Mike Brown', 21, '12th Grade'), ('Nina Black', 22, '12th Grade');\r\n"
    + "";
    @Autowired
    private JdbcTemplate jt; // Injects JdbcTemplate for database operations
    
//    @Override
//    public void createStudentTable() {
//        jt.execute(CREATE_STUDENT_TABLE); // Executes the CREATE TABLE SQL statement
//        System.out.println("Student table created successfully.");
//    }

    @Override
    public void insertRecords() {
        jt.update(INSERT_DATA); // Use update for executing insert queries
        System.out.println("Records inserted successfully.");
    }
}
