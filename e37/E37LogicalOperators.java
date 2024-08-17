package org.example.e37;

import java.util.Scanner;

public class E37LogicalOperators {
    public static void main(String[] args) {
        // Create a Scanner object to read input
        Scanner input = new Scanner(System.in);
        // Print prompt for user to answer if they are thirsty
        System.out.println("Are you thirsty? (true/false)");
        // Capture the thirsty input|||
        boolean Thirsty=input.nextBoolean();
        // Print prompt for user to answer if they are sleepy
        System.out.println("Are you sleepy? (true/false)");
        // Capture the sleepy input
        boolean Sleepy=input.nextBoolean();
        // Determine the drink based on the inputs
        if(Thirsty && !Sleepy);{System.out.println("You need to drink Water");}
        if(Thirsty && Sleepy){System.out.println("You need to drink Coffee");}
        else if(!Thirsty && Sleepy){System.out.println("You need to drink Tea");}
        else{System.out.println("You need to drink nothing");}
        // Print the drink suggestion
        // Output: Looks like you need to drink ___
    }
}
