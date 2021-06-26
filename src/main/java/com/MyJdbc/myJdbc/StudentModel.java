package com.MyJdbc.myJdbc;

import org.springframework.stereotype.Component;

@Component
public class StudentModel {
    private String rollNumber,name;
    private int age;
    private String phone;

    public String getRollNumber() {
        return rollNumber;
    }

    public void setRollNumber(String rollNumber) {
        this.rollNumber = rollNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }


    public StudentModel(String rollNumber, String name, int age, String phone) {
        this.rollNumber = rollNumber;
        this.name = name;
        this.age = age;
        this.phone = phone;
    }

    public StudentModel() {
    }

    @Override
    public String toString() {
        return "StudentModel{" +
                "rollNumber='" + rollNumber + '\'' +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", phone='" + phone + '\'' +
                '}';
    }
}
