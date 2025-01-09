package com.fet;

import java.util.Scanner;

public class scannerdemo {

    public static void main(String[] args){
        Scanner s = new Scanner(System.in);

        System.out.println("Enter the a value: ");
        Double a = s.nextDouble();
        System.out.println("Enter the b value: ");
        Double b = s.nextDouble();
        Double c = a + b;
        System.out.println("The Sum of a and b is: "+c);

    }


}
