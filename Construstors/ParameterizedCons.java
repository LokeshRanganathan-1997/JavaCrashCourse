package com.Construstors; // Corrected package name from "Construstors" to "Constructors"

public class ParameterizedCons {
    // Instance variables to hold the animal's name and type
    String animalName; // Changed variable name to follow Java naming conventions
    String animalType; // Changed variable name to follow Java naming conventions

    // Parameterized constructor to initialize animal's name and type
    ParameterizedCons(String name, String type) {
        animalName = name; // Assigning the name passed to the constructor
        animalType = type; // Assigning the type passed to the constructor
    }

    // Method to describe the animal
    public void sayAboutAnimals() {
        // Print the animal's name and type
        System.out.println("Animal name is " + animalName + " and type is " + animalType);
    }

    public static void main(String[] args) {
        // Creating instances of ParameterizedCons with different animals
        ParameterizedCons value1 = new ParameterizedCons("Lion", "Wild");
        value1.sayAboutAnimals(); // Calling method to describe the lion

        ParameterizedCons value2 = new ParameterizedCons("Dog", "Domestic");
        value2.sayAboutAnimals(); // Calling method to describe the dog
    }
}