package com.MyJdbc.myJdbc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);



        StudentModel studentModel = context.getBean(StudentModel.class);
        studentModel.setAge(20);
        studentModel.setName("Gokul");
        studentModel.setPhone("9465345785");
        studentModel.setRollNumber("18EUIT040");

        StudentDao s = context.getBean(StudentDaoImplementation.class);

//        s.insert(studentModel);
//        s.execute(studentModel);
//        s.delete(studentModel);
    }

}
