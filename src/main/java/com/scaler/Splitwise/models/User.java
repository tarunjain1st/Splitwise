package com.scaler.Splitwise.models;

import jakarta.persistence.Entity;
import lombok.Data;

import java.util.List;

@Data
@Entity(name = "users")
public class User extends  BaseModel{
    private String name;
    private String password;
    private String phoneNumber;
}
