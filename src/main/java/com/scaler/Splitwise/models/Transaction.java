package com.scaler.Splitwise.models;

import lombok.Data;

@Data
public class Transaction {
    private User userFrom;
    private User userTo;
    private int amount;
}
