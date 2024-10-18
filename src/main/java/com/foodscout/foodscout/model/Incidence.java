package com.foodscout.foodscout.model;

import java.time.LocalDateTime;

import com.foodscout.foodscout.model.utils.Scopes;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
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
    
    @Enumerated(EnumType.STRING)
    @Column
    private String priority;

    @Column
    @Enumerated(EnumType.STRING)
    private Scopes scope;

    @Column(nullable = true)
    private LocalDateTime Update;
    @Column(name = "deletedAt", nullable = true)
    private LocalDateTime deletedAt;
    @Column
    private LocalDateTime createdAt;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User userCreated;
   
}
