package com.fet;

import java.util.Scanner;

public class minandmax {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the a value: ");
        int a = s.nextInt();
        System.out.println("Enter the b value: ");
        int b = s.nextInt();
        System.out.println("Enter the c value: ");
        int c = s.nextInt();
//        if (a >= b && b >= c) {
//            System.out.println("The max value is a");
//        } else if(b>=a && b>=c) {
//            System.out.println("The max value is b");
//        } else{
//            System.out.println(" The max value is c");
//        }
        if(a<=b && b<=c){
            System.out.println("The min value is a "+a);

        }else if(b<=a && b<=c){
            System.out.println("The min value is b "+b);

        }else{
            System.out.println("The min value is c "+c);
        }
    }
}
