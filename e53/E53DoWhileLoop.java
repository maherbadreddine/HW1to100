package org.example.e53;

public class E53DoWhileLoop {
    public static void main(String[] args) {

        // Declare a counter variable and set it to 20
        int counter = 20;

        do {
            if (counter % 2 == 0) ;
            System.out.println(counter);
            counter -= 2;
        } while (counter >= 2);

        // Use a do-while loop to print even numbers from 20 to 2
        // Inside the loop, print the value of counter if it is even
        // Decrement the counter by 2
    }
}