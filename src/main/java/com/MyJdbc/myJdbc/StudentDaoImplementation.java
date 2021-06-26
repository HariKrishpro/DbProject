package com.MyJdbc.myJdbc;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class StudentDaoImplementation implements StudentDao{
    private JdbcTemplate jdbcTemplate = new JdbcTemplate(new DriverManagerDataSource("jdbc:mysql://localhost/jdbcapi","root",""));;
//
//    @Autowired
//    public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
//        this.jdbcTemplate = jdbcTemplate;
//    }

    @Override
    public void insert(StudentModel studentModel) {
        String query = "Insert into `studentdetails` values (?,?,?,?)";
        Object[] a = {studentModel.getRollNumber(),studentModel.getName(),studentModel.getAge(),studentModel.getPhone()};
        jdbcTemplate.update(query,a);
    }

    @Override
    public void delete(String RollNumber) {
        String query = "DELETE FROM `studentdetails` WHERE  RollNumber=?";
         jdbcTemplate.update(query,RollNumber);
    }

    @Override
    public void update(StudentModel studentModel) {
        String query = "Update `studentdetails` SET Name=? , Age = ? ,Phone=? WHERE RollNumber=?";
        Object[] a = {studentModel.getName(),studentModel.getAge(),studentModel.getPhone(),studentModel.getRollNumber()};
        jdbcTemplate.update(query,a);
    }

    @Override
    public List<StudentModel> showAll() {
        String sql = "Select * from studentdetails";
        return jdbcTemplate.query(sql,new StudentRowMapper());
    }

    @Override
    public void cleanUp() {
        String sql = "TRUNCATE TABLE studentdetails";
        jdbcTemplate.execute(sql);
    }

}
