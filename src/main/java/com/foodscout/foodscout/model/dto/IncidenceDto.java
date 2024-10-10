package com.foodscout.foodscout.model.dto;

import com.foodscout.foodscout.model.User;

public class IncidenceDto {
    private Long id;
    private String category;
    private String description;
    private String priority;
    private User userCreated;
   
    public IncidenceDto(Long id,String category, String description, String priority, User userCreated) {
        this.id= id;
        this.category = category;
        this.description = description;
        this.priority = priority;
        this.userCreated = userCreated;
    }
    public String getCategory() {
        return category;
    }
 
    public String getDescription() {
        return description;
    }
 
    public String getPriority() {
        return priority;
    }
 
    public User getUserCreated() {
        return userCreated;
    }
 
    public void setCategory(String category) {
        this.category = category;
    }
 
    public void setDescription(String description) {
        this.description = description;
    }
 
    public void setPriority(String priority) {
        this.priority = priority;
    }
 
    public void setUserCreated(User userCreated) {
        this.userCreated = userCreated;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

}
