package com.ConditionalStatements;

public class LetsHaveCoffee {
    // Boolean datatype will return only true or false
    boolean isCupEmpty;

    public static void main(String[] args) {
        // Creating an instance of LetsHaveCoffee
        LetsHaveCoffee coffee = new LetsHaveCoffee();

        // Checking if the cup is empty and printing the appropriate message
        if (coffee.isCupEmpty) {
            System.out.println("Fill the cup.");
        } else {
            System.out.println("Drink the coffee.");
        }
    }
}