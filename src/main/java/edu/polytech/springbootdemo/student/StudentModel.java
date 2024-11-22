package edu.polytech.springbootdemo.student;

import java.time.LocalDate;

public class StudentModel {

    private String firstname;

    private String lastname;

    private LocalDate dateofbirth;

    private String email;

    private int age;

    public StudentModel() {
    }

    public StudentModel(String firstname, String lastname, LocalDate dateofbirth, String email, int age) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.dateofbirth = dateofbirth;
        this.email = email;
        this.age = age;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public LocalDate getDateofbirth() {
        return dateofbirth;
    }

    public void setDateofbirth(LocalDate dateofbirth) {
        this.dateofbirth = dateofbirth;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
