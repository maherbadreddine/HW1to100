package org.example.e31;

import java.util.Scanner;

public class E31NestedIfAndScanner {
    public static void main(String[] args) {

        // Create a Scanner object to read input
        Scanner scan = new Scanner(System.in);
        System.out.println("Is it sunny outside?");

        // Declare a boolean variable isSunny
        boolean isSunny= scan.nextBoolean();
        int temperature=scan.nextInt();
        if(isSunny){System.out.println("yes is sunny");
          if(temperature>=20){System.out.println("its hot");

                System.out.println("no is not sunny");
            }

        }
        // Print "Is it sunny outside? (true/false)"


        // Capture the user's input and store it in isSunny

        // Declare an integer variable temperature

        // Use an if-else statement to check if it is sunny



    }
}
