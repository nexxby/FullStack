package com.foodscout.foodscout.model;

import java.time.LocalDateTime;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "incidence")
@NoArgsConstructor
@AllArgsConstructor
@Data
public class Incidence {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column
    private String description;

    @Column
    private String priority;

    @Column
    private LocalDateTime lastUDate;
    @Column
    private LocalDateTime deletedAt;
    @Column
    private LocalDateTime createdAt;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User userCreated;
    // Incidence(){
    // }
    // Incidence(
    //     Long id,
    //     String category,
    //     String description,
    //     String priority,
    //     LocalDateTime lastUDate,
    //     LocalDateTime deletedAt,
    //     LocalDateTime createdAt,
    //     User userCreated
    // ) {
    //     this.id= id;
    //     this.category= category;
    //     this.description= description;
    //     this.priority = priority;
    //     this.lastUDate = lastUDate;
    //     this.deletedAt = deletedAt;
    //     this.createdAt =createdAt;

        



    // }

    // public Long getId() {
    //     return id;
    // }

    // public void setId(Long id) {
    //     this.id = id;
    // }

    // public String getCategory() {
    //     return category;
    // }

    // public void setCategory(String category) {
    //     this.category = category;
    // }

    // public String getDescription() {
    //     return description;
    // }

    // public void setDescription(String description) {
    //     this.description = description;
    // }

    // public String getPriority() {
    //     return priority;
    // }

    // public void setPriority(String priority) {
    //     this.priority = priority;
    // }

    // public LocalDateTime getLastUDate() {
    //     return lastUDate;
    // }

    // public void setLastUDate(LocalDateTime lastUDate) {
    //     this.lastUDate = lastUDate;
    // }

    // public LocalDateTime getDeletedAt() {
    //     return deletedAt;
    // }

    // public void setDeletedAt(LocalDateTime deletedAt) {
    //     this.deletedAt = deletedAt;
    // }

    // public LocalDateTime getCreatedAt() {
    //     return createdAt;
    // }

    // public void setCreatedAt(LocalDateTime createdAt) {
    //     this.createdAt = createdAt;
    // }

    // public User getUserCreated() {
    //     return userCreated;
    // }

    // public void setUserCreated(User userCreated) {
    //     this.userCreated = userCreated;
    // }
}
