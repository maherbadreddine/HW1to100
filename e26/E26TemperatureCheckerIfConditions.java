package org.example.e26;

public class E26TemperatureCheckerIfConditions {
    public static void main(String[] args) {
        // Declare a variable for temperature and assign a value

        int temperature=25;
        if (temperature>=30){System.out.println("It's hot outside.");}
        else if(temperature>=20-30){System.out.println("It's warm outside.");}
        else if(temperature>=10-20){System.out.println("It's cool outside.");}
        else if(temperature<10){System.out.println("It's cold outside.");}

    }
}
