package com.exceptionHandling;

// Custom exception class for low petrol
class LowPetrolException extends Exception {
    public LowPetrolException(String exception) {
        super(exception); // Call the constructor of the parent Exception class
    }
}

public class ExceptionHandling {
    // Method that simulates riding a car
    public void Riding() {
        try {
            throw new LowPetrolException("Low petrol is indicating");
        } catch (LowPetrolException e) {
        	
        	e.printStackTrace();
            // Handle the LowPetrolException
            System.out.println("If the car stops, ask a friend to buy petrol");
            System.out.println("Catch a cab and buy petrol");
        }
    }

    public static void main(String[] args) {
        // Creating an instance of ExceptionHandling
        ExceptionHandling test = new ExceptionHandling();
        // Calling the Riding method to demonstrate exception handling
        test.Riding();
    }
}