package org.example.e15;

public class E15TimeConversionModulus {
    public static void main(String[] args) {
        // Declare the int variable and assign a value
        int totalMinutes = 125;
        int oneHour=60;



        // Calculate hours and minutes
        int hours = (totalMinutes/oneHour);
        int minutes= (totalMinutes%oneHour) ;


        // Print the results
        System.out.println(totalMinutes+" "+"minutes is equal to"+" "+hours+" "+"hours and"+" "+minutes+" "+"minutes");

    }
}