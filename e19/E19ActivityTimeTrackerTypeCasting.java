package org.example.e19;

public class E19ActivityTimeTrackerTypeCasting {
    public static void main(String[] args) {
        // Declare the double variables and assign values

        //    `activity1`, `activity2`, and `activity3`. Assign any values to these variables (e.g., 45.5, 30.2, and 60.7).
        double activity1 = 45.5;
        double activity2=30.2;
        double activity3=60.7;


        // Calculate total time
        double totalTime = (activity1+activity2+activity3);


        // Type cast the total time to an int to get total minutes
        int totalMinutes= (int)(totalTime);


        // Calculate hours and remaining minutes
        int hours= (int)(totalTime/60);
        int minutes= (int)(totalTime%60);



        // Print the results
        System.out.println(totalTime);
        System.out.println(hours);
        System.out.println(minutes);



    }
}