package org.example.e45;

import java.util.Scanner;

public class E45SwitchClass {
    public static void main(String[] args) {
        // Create a Scanner object to read input
        Scanner input = new Scanner(System.in);
        // Print prompt for user to enter the type of coffee (1 for Espresso, 2 for Latte, 3 for Cappuccino, 4 for Mocha)
        System.out.println("Enter the type of coffee (1 for Espresso, 2 for Latte, 3 for Cappuccino, 4 for Mocha)");
        // Capture the coffee type input
        int coffee= input.nextInt();
        // Print the price
        switch (coffee){
        case 1: System.out.println("Espresso costs $3.00");
        break;
        case 2: System.out.println("Latte costs $4.00");
        break;
        case 3: System.out.println("Cappuccino costs $4.50");
        break;
        case 4: System.out.println("Mocha costs $5.00");
        break;
        default:System.out.println("Invalid coffee type entered");}
        }}

