package com.company.bucket3.entity;

import com.haulmont.cuba.core.entity.StandardEntity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Table(name = "BUCKET3_USER")
@Entity(name = "bucket3_User")
public class User extends StandardEntity {
    private static final long serialVersionUID = 1662422460939680920L;
    @Column(name = "user_name")
    String userName;

    @Column (name = "password")
    String password;

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

}