package com.javatpoint.basic;

import java.util.Scanner;

public class PerfectSquare {
    public static void main(String[] args) {
        System.out.println("Enter Number you want to check perfect Square");
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        checkPerfectSquare(num);
    }

    private static void checkPerfectSquare(int num) {
      double b=  Math.sqrt(num);
        System.out.println(b);
        int a= (int) b;
        if(num==a*a)
            System.out.println("Entered Number is perfect Square");
        else
            System.out.println("It's Not perfect Square");
    }
}
