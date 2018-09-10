package com.company;

import java.util.ArrayList;

public class Customers {
   private String customerName;
   private ArrayList<Double> transactions;

    public Customers(String customerName, double ammount) {
        this.customerName = customerName;
        this.transactions = new ArrayList<>();
    }

    public void addTransaction(double amount){
        this.transactions.add(amount);
    }

    public String getCustomerName() {
        return customerName;
    }

    public ArrayList<Double> getTransactions() {
        return transactions;
    }
}

