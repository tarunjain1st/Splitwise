package com.scaler.Splitwise.models;

import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

@Data
@Entity
public class Expense extends BaseModel{
    private String description;
    private int amount;
    @ManyToOne
    private User createdBy;
    @ManyToOne
    private Group group;
    @Enumerated(EnumType.ORDINAL)
    private ExpenseType expenseType;
    @OneToMany(fetch = FetchType.EAGER, mappedBy = "expense")
    private List<UserExpense> userExpenses;
}
