package com.fet;

import java.util.Scanner;

public class evenorodd {
    public static void main(String[] args) {
        int num;
        Scanner s = new Scanner(System.in);
        System.out.println("Please enter the number: ");
        num = s.nextInt();
        if (num % 2 == 0) {
            System.out.println("You have entered even number." + num);
        } else {
            System.out.println("You have entered odd number.");
        }


    }
}


