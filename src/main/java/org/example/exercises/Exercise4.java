package org.example.exercises;

public class Exercise4 {

    public static void recursiveMethod() {
        try {
            recursiveMethod();
        } catch (StackOverflowError e) {
            System.out.println("Oops, we're out of space on the stack. Goodnight.");
        }

    }
}
