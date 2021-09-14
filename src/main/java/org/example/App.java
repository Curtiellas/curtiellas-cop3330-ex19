package org.example;

/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 luis curtiellas
 */

import java.util.*;

public class App 
{
    public static void main( String[] args )
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your height in inches: ");
        double height = numericCheck();
        System.out.print("Enter your weight in pounds: ");
        double weight = numericCheck();

        //calculate
        double BMI = (weight / (height * height)) * 703;

        //output line 1
        System.out.printf("Your BMI is %.1f.\n", BMI);

        //decision
        if (BMI < 18.5)
            System.out.println("You are underweight. You should see your doctor.");

        else if (BMI >= 18.5 && BMI <= 25.0)
            System.out.println("You are within the ideal weight range.");

        else
            System.out.println("You are overweight. You should see your doctor.");
    }

    public static double numericCheck ()
    {
        Scanner sc = new Scanner((System.in));
        double theNumber;

        while (true)
        {
            try {
                theNumber = Double.parseDouble(sc.next());
                return theNumber;
            } catch (NumberFormatException e) {
                System.out.print("Invalid input. Try again. ");
            }
        }
    }
}
