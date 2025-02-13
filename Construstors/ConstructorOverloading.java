package com.Construstors;

public class ConstructorOverloading {
    // Instance variable to hold the type of milk
    String milk;

    // Default constructor
    ConstructorOverloading() {
        System.out.println("Milk is purchased.");
    }

    // Parameterized constructor
    ConstructorOverloading(String milkType) {
        milk = milkType;
        System.out.println("Buy milk and prepare " + milkType + ".");
    }

    public static void main(String[] args) {
        // Creating an instance using the default constructor
        ConstructorOverloading purchase1 = new ConstructorOverloading();

        // Creating an instance using the parameterized constructor
        ConstructorOverloading purchase2 = new ConstructorOverloading("Coffee");
    }
}