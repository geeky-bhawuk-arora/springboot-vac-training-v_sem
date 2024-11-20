package com.rk.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.rk.model.Student;

@Repository
public class StudentDAO {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    /**
     * Save student data into the database.
     *
     * @param student the student object containing data to be saved
     * @return the number of rows affected
     */
    public int saveStudent(Student student) {
        String sql = "INSERT INTO students (name, email, mobile, address) VALUES (?, ?, ?, ?)";
        return jdbcTemplate.update(
                sql,
                student.getSname(),
                student.getSemail(),
                student.getSmobile(),
                student.getSaddress()
        );
    }
}
