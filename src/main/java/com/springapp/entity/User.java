package com.springapp.entity;

import javax.persistence.*;

/**
 * Created by otkurbiz on 10/14/15.
 */
@Entity(name = "user")
public class User {

    public User(){
        super();
    }

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private Integer id;

    @Column(name = "name",length = 100)
    private String name;

    @Column(name = "gender")
    private Integer gender;

    @Column(name = "role")
    private Integer role;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getGender() {
        return gender;
    }

    public void setGender(Integer gender) {
        this.gender = gender;
    }

    public Integer getRole() {
        return role;
    }

    public void setRole(Integer role) {
        this.role = role;
    }
}
