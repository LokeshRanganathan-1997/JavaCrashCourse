package com.javaCrashCourse;

public class BankAccount {
    // Instance variable to hold the account number
    Long accountNumber = 9220100153014L; // 'L' denotes that this is a long literal
    
    // Instance variable to hold the account holder's name
    String holderName = "Wills"; 
    
    // Instance variable to hold the account balance
    Integer accountBalance = 1000; 

    // Method to display the account balance
    public void getBalance() {
        // Print the current balance to the console
        System.out.println("Balance is: " + accountBalance);
    }

    public static void main(String[] args) {
        // Creating an instance of BankAccount
        BankAccount account = new BankAccount();
        
        // Calling the getBalance method to display the account balance
        account.getBalance();
    }
}