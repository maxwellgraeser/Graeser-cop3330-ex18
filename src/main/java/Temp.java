/*
 *  UCF COP3330 Fall 2021 Exercise 18 Solution
 *  Copyright 2021 Maxwell Graeser
 */

import java.util.Scanner;
public class Temp {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter C to convert from Fahrenheit  to Celsius\nEnter F to convert from Celsius to Fahrenheit\n");
        String input = scan.nextLine();
        String output;
        double tempIn;
        double convTemp;
        if (input.equals("C") || input.equals("c")) {
            System.out.print("Enter the temperature in Fahrenheit: ");
            tempIn = Double.parseDouble(scan.nextLine());
            //C = (F − 32) × 5 / 9
            convTemp = (tempIn - 32) * 5 / 9;
            output = String.format("The temperature in Celsius is %.1f", convTemp);
        }
        else if (input.equals("F") || input.equals("f")) {
            System.out.print("Enter the temperature in Celsius: ");
            tempIn = Double.parseDouble(scan.nextLine());
            //F = (C × 9 / 5) + 32
            convTemp = (tempIn * 9 / 5) + 32;
            output = String.format("The temperature in Fahrenheit is %.1f", convTemp);
        }
        else {
            System.out.println("Not a valid input");
            return;
        }

        System.out.println(output);
    }
}