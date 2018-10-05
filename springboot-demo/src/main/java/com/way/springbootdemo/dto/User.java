package com.way.springbootdemo.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.io.Serializable;

/**
 * @Auther: Way Leung wayleung13@163.com
 * @Date: 10/3/2018 16:55
 * @Description:
 */
@Entity
public class User implements Serializable {

    //要添加序列化
    private static final long serialVersionUID = 8892853727668868385L;

    @Id
    @GeneratedValue
    private Integer id;

    @Column
    private String username;

    @Column
    private String password;

    @Column
    private Integer gender;

    @Column
    private Long birthdate;

    public User() {
    }

    public User(String username, String password, Integer gender, Long birthdate) {
        this.username = username;
        this.password = password;
        this.gender = gender;
        this.birthdate = birthdate;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Integer getGender() {
        return gender;
    }

    public void setGender(Integer gender) {
        this.gender = gender;
    }

    public Long getBirthdate() {
        return birthdate;
    }

    public void setBirthdate(Long birthdate) {
        this.birthdate = birthdate;
    }

    @Override
    public String toString() {
        return "User{" +
                "username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", gender=" + gender +
                ", birthdate=" + birthdate +
                '}';
    }


}