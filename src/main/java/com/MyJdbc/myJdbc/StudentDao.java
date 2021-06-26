package com.MyJdbc.myJdbc;

import java.util.List;

public interface StudentDao {
    void insert(StudentModel studentModel);
    void delete(String RollNumber);
    void update(StudentModel studentModel);
    List<StudentModel> showAll();

    void cleanUp();

}
