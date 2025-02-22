package org.example.e72;

import java.util.Scanner;

public class E72Arrays {
    public static void main(String[] args) {

        // Create a Scanner object to read input from the console
        Scanner scanner = new Scanner(System.in);

        // Create an array of strings with size 7
        String[] weekdays = new String[7];

        // Use a loop to prompt the user to input the days of the week one by one and store each input in the array
        for (int i = 0; i < 7; i++) {
            System.out.print("Please enter day " + (i + 1) + " of the week");
            System.out.println();
            weekdays[i] = scanner.nextLine();
        }
        // Use another loop to iterate through the array and print each value on a new line
        for (int i = 0; i < 7; i++) {
            System.out.println(weekdays[i]);
        }
    }
}