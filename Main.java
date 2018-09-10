package com.company;

import java.util.Scanner;

public class Main {

   private Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("Welcome to Us Bank.");






    }public void program(int choose){
        Bank usBank = new Bank("Us Bank");
        System.out.println("Please make your selection.");
        printInstructions();
        choose = sc.nextInt();

        boolean quite = false;

        while (!quite){
            switch (choose){
                case 1:
                    if(usBank.addNewBranch(sc.nextLine())){
                        System.out.println("Branch added successfully!");
                    }
                    System.out.println("There was an error. :( ");

                    break;
                case 2:
                    printInstructions();
                    break;
                case 3:
                    usBank.
                    break;
                case 4:
                    break;
                case 5:
                    break;
                case 6:
                    break;
                case 7:
                    break;
                case 8:
                    break;

            }
        }
    }

    public void printInstructions(){
        System.out.println("1. Create a new Bank");
        System.out.println("2. Print Instructions.");
        System.out.println("3. Add Customer to branch.");
        System.out.println("4. Add transaction.");
        System.out.println("5. Print Customers in branch. ");
    }
}
