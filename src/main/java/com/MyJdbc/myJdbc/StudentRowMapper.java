package com.MyJdbc.myJdbc;

import com.MyJdbc.myJdbc.StudentModel;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class StudentRowMapper implements RowMapper<StudentModel> {
    @Override
    public StudentModel mapRow(ResultSet resultSet, int i) throws SQLException {
        StudentModel studentModel = new StudentModel();
        studentModel.setRollNumber(resultSet.getString("RollNumber"));
        studentModel.setName(resultSet.getString("Name"));
        studentModel.setAge(resultSet.getInt("Age"));
        studentModel.setPhone(resultSet.getString("Phone"));
        return studentModel;
    }
}
