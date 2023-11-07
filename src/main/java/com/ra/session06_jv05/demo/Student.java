package com.ra.session06_jv05.demo;

public class Student {
    private String studentId;
    private String fullName;
    private int age;
    private Boolean sex;

    public Student() {
    }

    public Student(String studentId, String fullName, int age, Boolean sex) {
        this.studentId = studentId;
        this.fullName = fullName;
        this.age = age;
        this.sex = sex;
    }

    public String getStudentId() {
        return studentId;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Boolean getSex() {
        return sex;
    }

    public void setSex(Boolean sex) {
        this.sex = sex;
    }
}
