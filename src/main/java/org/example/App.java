package org.example;
import java.util.Scanner;

/*
 *  UCF COP3330 Summer 2021 Assignment 11 Solution
 *  Copyright 2021 Anisha Ranjan
 */
public class App 
{
    public static void main( String[] args ) {

        Scanner in = new Scanner(System.in);

        System.out.print("How many euros are you exchanging? ");
        int c_from = in.nextInt();
        System.out.print("What is the exchange rate? ");
        double rate = in.nextDouble();

        double c_to = c_from * rate;

        System.out.printf("%d euros at an exchange rate of %.4f is\n%.2f U.S. dollars.", c_from, rate, c_to);




    }
}
