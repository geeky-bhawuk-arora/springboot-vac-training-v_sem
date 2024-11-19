package com.springLearning;

import java.util.List;
import java.util.Map;

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
    
    private static final String SELECT_RECORDS = "SELECT * FROM students";
    @Autowired
    private JdbcTemplate jt; // Injects JdbcTemplate for database operations
    
//    @Override
//    public void createStudentTable() {
//        jt.execute(CREATE_STUDENT_TABLE); // Executes the CREATE TABLE SQL statement
//        System.out.println("Student table created successfully.");
//    }

    @Override
    public void insertRecords() {
        jt.update(INSERT_DATA);
        System.out.println("Records inserted successfully.");
    }
    
    @Override
    public void selectAllRecords() {
        List<Map<String, Object>> rows = jt.queryForList(SELECT_RECORDS); 
        System.out.println("Rows fetched: " + rows.size());
        
        for (Map<String, Object> row : rows) {
            System.out.println("ID: " + row.get("id") + ", Name: " + row.get("name") +
                               ", Age: " + row.get("age") + ", Class: " + row.get("class"));
        }
    }
}
