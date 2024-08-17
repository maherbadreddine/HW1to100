package org.example.e25;

public class E25DailyExpenseTrackerIfConditions {
    public static void main(String[] args) {
        // Assign values to daily expenses
        int morningExpense=25;
        int afternoonExpense=35;
        double eveningExpense=16.25;

        // Calculate total expense
        double totalExpense=morningExpense+afternoonExpense+eveningExpense;
        System.out.println("Your total daily expense is "+totalExpense);

        // Define a budget
        int budget=100;

        // Check if within budget
        if (budget<76.25){
            System.out.println("You are not within the budget.");}
        else{
            System.out.println("You are within the budget.");}
    }
    }

