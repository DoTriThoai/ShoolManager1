package com.trithoai.schoolmanager.models;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

/**
 * Created by johncarter on 09/04/2016.
 */
@Entity
@Table(name = "students")
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    @NotNull
    @Column(name = "student_name")
    private String studentName;

    @NotNull
    @Column(name = "student_dob")
    private String studentDob;

    @ManyToOne
    private Classss classss;

    public Student(){}

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public String getStudentDob() {
        return studentDob;
    }

    public void setStudentDob(String studentDob) {
        this.studentDob = studentDob;
    }

    public Classss getClassss() {
        return classss;
    }

    public void setClassss(Classss classss) {
        this.classss = classss;
    }

    public Student(String studentName, String studentDob){
        super();
        this.studentName = studentName;
        this.studentDob = studentDob;

    }

    public Student(String studentName, String studentDob, Classss classss){
        super();
        this.studentName = studentName;
        this.studentDob = studentDob;
        this.classss = classss;

    }
}
