package com.SpringBot.springBoot;


import com.MyJdbc.myJdbc.StudentDao;
import com.MyJdbc.myJdbc.StudentDaoImplementation;
import com.MyJdbc.myJdbc.StudentModel;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.NoSuchElementException;

@Service
public class StudentModelBusiness {
    private StudentDao studentDao = new StudentDaoImplementation();

    public List<StudentModel> getStudentModels(){
//        System.out.println(studentDao.showAll());
        return studentDao.showAll();
    }

    public StudentModel getSpecificStudentModel(String rollNumber) {
        try {
            return studentDao.showAll().stream().filter(l -> l.getRollNumber().equals(rollNumber)).findFirst().get();
        }
        catch (NoSuchElementException sql){
            return null;
        }

    }

    public void addSpecificStudentModel(StudentModel studentModel){
        studentDao.insert(studentModel);
        System.out.println("LIST AFTER ADDED : \n" );
        studentDao.showAll().forEach(
                l -> {
//                    System.out.println(l.toString());
            });
    }

    public void updateSpecificStudentModel(StudentModel studentModel,String id){
        studentDao.update(studentModel);
        studentDao.showAll().forEach(
                l -> {
//                    System.out.println(l.toString());
                });
    }

    public void deleteSpecificStudentModel(String id){
        studentDao.delete(id);
        System.out.println("AFTER DELETION :\n");
        studentDao.showAll().forEach(
                l -> {
//                    System.out.println(l.toString());
                });
    }

}
