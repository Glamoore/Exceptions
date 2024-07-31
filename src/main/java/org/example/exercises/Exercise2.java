package org.example.exercises;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Exercise2  {

    public static int[] getUserInput() {
        Scanner input = new Scanner(System.in);
        String divisor = "";
        String dividend = "";
        int[] output = new int[2];
        while (true) {
            System.out.print("Enter divisor: ");
            divisor = input.nextLine();
            System.out.print("Enter dividend: ");
            dividend = input.nextLine();
            try {
                output[0] = Integer.parseInt(divisor);
            }
                    catch(NumberFormatException e) {
                        System.out.println("Invalid input. Please try again.");
                        continue;
            }
            try {
                output[1] = Integer.parseInt(dividend);
            }
            catch(NumberFormatException e) {
                System.out.println("Invalid input. Please try again.");
                continue;
            }
            return output;
        }
    }
}
