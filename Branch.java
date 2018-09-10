package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class Branch {

    private String name;
    private ArrayList<Customers> customers;

    public Branch(String name) {
        this.name = name;
        this.customers = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public ArrayList<Customers> getCustomers() {
        return customers;
    }

    public boolean addNewCustomer(String customerName, double initialTransaction) {
        if (findCustomer(customerName) == null) {
            this.customers.add(new Customers(customerName, initialTransaction));
            return true;

        }
        return false;
    }
    public boolean addCustomerTransaction(String customerName, double amount){
        Customers existingCustomer = findCustomer(customerName);
        if(existingCustomer != null){
            existingCustomer.addTransaction(amount);

        }
        System.out.println("No Customer Exists.");
        return false;

    }
    public Customers findCustomer(String customerName){
        for(int i =0; i < customers.size(); i++){
            Customers checkedCustomer = this.customers.get(i);
            if(checkedCustomer.getCustomerName().equals(customerName)){
                return checkedCustomer;
            }
        }
        return null;
    }
}
