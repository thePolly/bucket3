package com.company.bucket3.entity;

import com.haulmont.cuba.core.entity.StandardEntity;

import javax.persistence.*;
import java.time.LocalDateTime;

@Table(name = "BUCKET3_BUCKET")
@Entity(name = "bucket3_Bucket")
public class Bucket extends StandardEntity {
    private static final long serialVersionUID = 5092348006262607143L;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name="user_name")
    User user;

    @Column(name="name")
    String name;

    @Column(name="priority")
    String priority;

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPriority() {
        return priority;
    }

    public void setPriority(String priority) {
        this.priority = priority;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public LocalDateTime getDate() {
        return date;
    }

    public void setDate(LocalDateTime date) {
        this.date = date;
    }

    @Column(name="description")
    String description;

    @Column(name = "date")
    LocalDateTime date;



}