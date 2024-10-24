package com.scaler.Splitwise.models;

import jakarta.persistence.Entity;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import lombok.Data;

import java.util.Date;
import java.util.List;

@Data
@Entity(name = "user_group")
public class Group extends BaseModel{
    private String name;
    @ManyToMany
    private List<User> users;
    @ManyToOne
    private User createdBy;
    @OneToMany(mappedBy = "group")
    private List<Expense> expenses;
}
