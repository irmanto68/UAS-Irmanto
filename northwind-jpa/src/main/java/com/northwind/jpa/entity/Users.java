/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.northwind.jpa.entity;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Max;

/**
 *
 * @author Lenovo
 */

@Entity
@Table (name = "users")

public class Users implements Serializable {
    private static final long serialVersionUID =1L;
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "userid")
    private Integer UserID;
    
    @Column(name = "name")
    @Max(40)
    private String Name;
    
    @Column(name = "title")
    @Max(30)
    private String Title;
    
    @Column(name = "birthdate")
    private Date BirthDate;
    
    @Column(name = "hiredate")
    private Date HireDate; 
    
    @Column(name = "position")
    @Max(30)
    private String Position;
    
    @Column(name = "email")
    @Max(30)
    private String Email;
    
    @Column(name = "password")
    @Max(60)
    private String Password;

    public Users() {
    }

    public Users(Integer UserID, String Name, String Title, Date BirthDate, Date HireDate, String Position, String Email, String Password) {
        this.UserID = UserID;
        this.Name = Name;
        this.Title = Title;
        this.BirthDate = BirthDate;
        this.HireDate = HireDate;
        this.Position = Position;
        this.Email = Email;
        this.Password = Password;
    }

    public Integer getUserID() {
        return UserID;
    }

    public void setUserID(Integer UserID) {
        this.UserID = UserID;
    }

    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public String getTitle() {
        return Title;
    }

    public void setTitle(String Title) {
        this.Title = Title;
    }

    public Date getBirthDate() {
        return BirthDate;
    }

    public void setBirthDate(Date BirthDate) {
        this.BirthDate = BirthDate;
    }

    public Date getHireDate() {
        return HireDate;
    }

    public void setHireDate(Date HireDate) {
        this.HireDate = HireDate;
    }

    public String getPosition() {
        return Position;
    }

    public void setPosition(String Position) {
        this.Position = Position;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String Email) {
        this.Email = Email;
    }

    public String getPassword() {
        return Password;
    }

    public void setPassword(String Password) {
        this.Password = Password;
    }
    
    
}
