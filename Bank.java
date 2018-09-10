package com.company;

import java.util.ArrayList;

public class Bank {
    private String name;
    private ArrayList<Branch> branches;

    public Bank(String name) {
        this.name = name;
        this.branches = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public ArrayList<Branch> getBranches() {
        return branches;
    }

    public boolean addNewBranch(String Name) {
        if (findBranch(Name) == null) {
            this.branches.add(new Branch(Name));
            return true;
        }return false;
    }

    public void addNewCustomertoBranch(String BranchName, String CustomerName, double amount) {
        Branch existingBranch = findBranch(BranchName);
        if (existingBranch != null) {
            existingBranch.addNewCustomer(CustomerName, amount);
        } else {
            System.out.println("No such Branch exists.");
        }
    }


    public Branch findBranch(String branchName) {
        for (int i = 0; i < branches.size(); i++) {
            Branch existingBranch = this.branches.get(i);
            if (existingBranch != null) {
                return existingBranch;
            }

        }
        return null;

    }

    public void printCustomerList(String branchName) {
        Branch existingBranch = findBranch(branchName);
        if (existingBranch != null) {

            for (int i = 0; i < existingBranch.getCustomers().size(); i++) {
                System.out.println(existingBranch.getCustomers());
            }
        }else {
            System.out.println("No Such Branch Exists");
        }
    }
}
