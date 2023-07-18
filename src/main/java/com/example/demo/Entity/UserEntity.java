package com.example.demo.Entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "user")
public class UserEntity {

    @Id
    @Column(name = "user_id" , length = 10)
    private int userID;

    @Column(name = "user_name",nullable = false,length = 100)
    private String userName;

    @Column(name = "email", nullable = false, unique = true)
    private String email;

    public UserEntity(int userID, String userName, String email) {
        this.userID = userID;
        this.userName = userName;
        this.email = email;
    }

    public UserEntity() {

    }

    public int getUserID() {
        return userID;
    }

    public void setUserID(int userID) {
        this.userID = userID;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public UserEntity(String userName, String email) {
        this.userName = userName;
        this.email = email;
    }

    @Override
    public String toString() {
        return "UserEntity{" +
                "userID=" + userID +
                ", userName='" + userName + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}
