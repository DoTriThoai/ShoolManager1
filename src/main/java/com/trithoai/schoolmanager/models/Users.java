package com.trithoai.schoolmanager.models;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

/**
 * Created by johncarter on 09/04/2016.
 */
@Entity
@Table(name = "user")
public class Users {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    @NotNull
    @Column(name = "username")
    private String userName;

    @NotNull
    @Column(name = "address")
    private String address;

    public Users(){}

    public Users(Integer id){
        super();
        this.id = id;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getUserName() {

        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public Users(String userName, String address){
        super();
        this.address = address;
        this.userName = userName;

    }

    public Users(Integer id, String userName, String address){
        super();
        this.id = id;
        this.userName = userName;
        this.address = address;
    }
}
