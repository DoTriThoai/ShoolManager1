package com.trithoai.schoolmanager.models;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.List;

/**
 * Created by johncarter on 07/04/2016.
 */
@Entity
@Table(name = "class")
public class Classss {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    @NotNull
    @Column(name = "class_name")
    private String className;

    public List<Student> getStudents() {
        return students;
    }

    public void setStudents(List<Student> students) {
        this.students = students;
    }

    @OneToMany
    private List<Student> students;

    public Classss(){super();}

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    public Classss(Integer id){
        super();
        this.id = id;
    }

    public Classss(String className){
        super();
        this.className = className;
    }
    public Classss(Integer id, String className){
        super();
        this.id = id;
        this.className = className;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
}
