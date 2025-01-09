package com.fet;

import java.util.Scanner;

public class calculateGrades {

    public static void main(String[] args) {
nestedif();
    }
    public static void nestedif(){
        int Marks;
        Scanner m = new Scanner(System.in);
        System.out.println("Enter the Marks: ");
        Marks = m.nextInt();
        if(Marks>=90){
            System.out.println("The Grade is A");
        }else if(Marks>=75 && Marks<90){
            System.out.println("The Grade is B");
        }else if(Marks>=50 && Marks<75){
            System.out.println("The Grade is C");
        }else{
            System.out.println("The Grade is Fail");
        }
    }
}
