package com.javaCrashCourse;

public class MarriageGift {
    // Instance variable to hold the amount collected as a gift
    public Integer amount1 = 1000;

    // Method to collect the gift amount and print it
    public Integer giftCollection() {
        // Print the amount collected
        System.out.println("Amount collected: " + amount1);
        // Return the collected amount
        return amount1;
    }

    public static void main(String[] args) {
        // Creating an instance of MarriageGift
        MarriageGift amount = new MarriageGift();
        
        // Calling the giftCollection method and storing the returned amount
        Integer price = amount.giftCollection();
        
        // Print the overall collected amount
        System.out.println("Overall collected amount is: " + price);
    }
}