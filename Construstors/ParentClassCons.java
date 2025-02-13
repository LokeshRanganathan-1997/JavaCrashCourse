package com.Construstors;

public class ParentClassCons {
    // Constructor for ParentClassCons
    public ParentClassCons() {
        System.out.println("ParentClass");
    }

    public static void main(String[] args) {
        // Creating an instance of ParentClassCons
        ParentClassCons P1 = new ParentClassCons();
        // No need to call the constructor again
        // P1.ParentClassCons(); // This line is removed as it is incorrect
    }
}