package com.fet;

import java.util.Scanner;

public class leapyear {
    public static void main(String[] args) {
        int year;
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the year: ");
        year = s.nextInt();
        if (year % 4 == 0) {
            System.out.println("You have entered the Leap Year.");
        } else {
            System.out.println("The year you have entered is not a Leap Year.");
        }
    }


    private void getHelloWorld() {
        System.out.println("Hello World");
    }

    }

