package org.example.e41;

import java.util.Scanner;

public class E41SwitchClass {
    public static void main(String[] args) {
        // Create a Scanner object to read input
        Scanner input = new Scanner(System.in);
        // Print prompt for user to enter the time of day
        System.out.println("Enter the time of day (morning, afternoon, evening, night)");
        // Capture the time of day input
        String time= input.next();
        // Recommend meal using switch statement
        switch (time){case"morning":System.out.println("Recommended meal: Breakfast");
        break;      case"afternoon":System.out.println("Recommended meal: Lunch");
        break;        case"evening":System.out.println("Recommended meal: Dinner");
        break;          case"night":System.out.println("Recommended meal: Snack");
        break;              default:System.out.println("Invalid time of day entered");}
        //    Print "Invalid time of day entered"




    }
}
