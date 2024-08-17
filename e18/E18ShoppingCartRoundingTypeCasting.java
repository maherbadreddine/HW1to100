package org.example.e18;

public class E18ShoppingCartRoundingTypeCasting {
    public static void main(String[] args) {
        // Declare the double variables and assign values
        //   - Create double variables for the prices of three items: `item1`, `item2`, and `item3`. Assign any values
        //   to these variables (e.g., 19.99, 29.75, and 4.99).
        double item1=19.99;
        double item2=29.75;
        double item3=4.99;

        // Calculate total cost
        double totalCost=(item1+item2+item3);



        // Type cast the double to an int to round it down
        int totalCost2=(int)totalCost;


        // Print the results
        System.out.println(totalCost);
        System.out.println(totalCost2);

    }
}
