package com.ConditionalStatements;

public class FavActor {
    // Instance variable to hold the favorite actor's name
    String myFavActor = "Ajith";

    // Method to guess the favorite actor
    public void favActorGuess() {
        if (myFavActor.equals("Arya")) {
            System.out.println("It was not Ajith.");
        } else if (myFavActor.equals("Vijay")) {
            System.out.println("He was my 3rd favorite.");
        } else if (myFavActor.equals("STR")) {
            System.out.println("He is my 2nd favorite.");
        } else {
            System.out.println("Sorry, your hero was not found.");
        }
    }

    public static void main(String[] args) {
        // Creating an instance of FavActor
        FavActor actor = new FavActor();
        // Calling the method to guess the favorite actor
        actor.favActorGuess();
    }
}