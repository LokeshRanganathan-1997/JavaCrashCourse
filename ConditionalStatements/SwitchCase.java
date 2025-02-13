package com.ConditionalStatements;

public class SwitchCase {
    String favFood = "MuttonBiryani";

    public void favFoodOrNot() {
        switch (favFood) { // Use the defined variable favFood
            case "ChickenBiryani":
                System.out.println("Chicken Biryani is not my favorite.");
                break; // Add break statement to avoid fall-through
            case "MuttonBiryani":
                System.out.println("It is my favorite food.");
                break; // Add break statement to avoid fall-through
            case "Curd Rice":
                System.out.println("Curd Rice is not my favorite.");
                break; // Add break statement to avoid fall-through
            default:
                System.out.println("Anyway, Curd with Pickle is also my favorite.");
                break; // Optional, but good practice
        }
    }

    public static void main(String[] args) {
        // Creating an instance of SwitchCase
        SwitchCase favFood = new SwitchCase();
        // Calling the method to check favorite food
        favFood.favFoodOrNot();
    }
}