package com.springLearning;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        StudentDaoImpl studentDao = context.getBean(StudentDaoImpl.class);
//        studentDao.insertRecords();
        studentDao.selectAllRecords();
    }
}
