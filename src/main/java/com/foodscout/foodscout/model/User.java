package com.foodscout.foodscout.model;

import java.time.LocalDateTime;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "Food_user")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @Column(name = "username", length = 8)
    private String username;
    @Column(name = "password", length = 8)
    private String password;
    @Column(name = "name", length = 8)
    private String name;
    @Column(name = "birthDate", length = 8)
    private String birthDate;
    // @Column(name = "role", length = 8)
    // private ERole role;
    @Column(name = "lastUDate", length = 8)
    private LocalDateTime lastUDate;
    @Column(name = "deletedAt", length = 8)
    private LocalDateTime deletedAt;
    @Column(name = "createdAt", length = 8)
    private LocalDateTime createdAt;

    /**
     * 
     */
    public User(  String username,
    String password,
    String name,
    String birthDate,
    LocalDateTime lastUDate,
    LocalDateTime deletedAt,
    LocalDateTime createdAt){
    
  

    
    this.username= username;
    this.password= password;
    this.name= name;
    this.birthDate= birthDate;
    this.lastUDate= lastUDate;
    this.deletedAt= deletedAt;
    this.createdAt= createdAt;

    
    

    }

    public Long getId() {
        return id;
    }
    public String getUsername() {
        return username;
    }
    public String getPassword() {
        return password;
    }
    public String getName() {
        return name;
    }
    public String getBirthDate() {
        return birthDate;
    }
    public LocalDateTime getLastUDate() {
        return lastUDate;
    }
    public LocalDateTime getDeletedAt() {
        return deletedAt;
    }
    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    public void setId(Long id) {
        this.id = id;
    }
    public void setUsername(String username) {
        this.username = username;
    }
    public void setPassword(String password) {
        this.password = password;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setBirthDate(String birthDate) {
        this.birthDate = birthDate;
    }
    public void setLastUDate(LocalDateTime lastUDate) {
        this.lastUDate = lastUDate;
    }
    public void setDeletedAt(LocalDateTime deletedAt) {
        this.deletedAt = deletedAt;
    }
    public void setCreatedAt(LocalDateTime createdAt) {
        this.createdAt = createdAt;
    }
 
    
}

