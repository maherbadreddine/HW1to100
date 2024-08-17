package org.example.e39;

import java.util.Scanner;

public class E39LogicalOperators {
    public static void main(String[] args) {
        // Create a Scanner object to read input
        Scanner input = new Scanner(System.in);
        // Print prompt for user to enter their mark
        System.out.println("Please enter your mark");
        // Capture the mark input
        int grade=input.nextInt();
        // Determine the grade based on the mark
        if(grade>1 && grade<=25){System.out.println("Your grade is F");}
        else if(grade>=26 && grade<=45){System.out.println("Your grade is E");}
        else if(grade>=46 && grade<=50){System.out.println("Your grade is D");}
        else if(grade>=51 && grade<=60){System.out.println("Your grade is C");}
        else if(grade>=61 && grade<=80){System.out.println("Your grade is B");}
        else if(grade>=81 && grade<=100){System.out.println("Your grade is A");}
        else{System.out.println("Please enter valid mark");}
        // Print the grade
        // Output: Your grade is ____


    }
}
