package org.example.exercises;

public class NegativeIntegerInputException extends RuntimeException {
    String exceptionMessage = "";

    public NegativeIntegerInputException(int number) {
        String message = "The following negative integer(s) are not allowed in this operation: [" + number + "]";
        System.err.println(message);
        super.printStackTrace();
    }
}
