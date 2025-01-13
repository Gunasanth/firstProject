package com.fet;

import java.util.Scanner;

public class TriangleValidator {
    public static void main(String[] args) {
        int side1;
        int side2;
        int side3;
        Scanner s = new Scanner(System.in);
        System.out.println("Please enter all the three sides of triangle: ");
        side1 = s.nextInt(); side2 = s.nextInt(); side3 = s.nextInt();

        if(side1 * side1 + side2 * side2 == side3 * side3 || side2 * side2 + side3 * side3 == side1 * side1 || side3 * side3 + side1 * side1 == side2 * side2){
            System.out.println("The sides that you entered is a Right angle triangle.");
        }
//        if(side2 * side2 + side3 * side3 == side1 * side1){
//            System.out.println("The sides that you entered is a Right angle triangle.");
//        }
//        if(side3 * side3 + side1 * side1 == side2 * side2){
//            System.out.println("The sides that you entered is a Right angle triangle.");
        else{
            System.out.println("The sides that you have entered is NOT the Right angle triangle.");
        }


    }
}
