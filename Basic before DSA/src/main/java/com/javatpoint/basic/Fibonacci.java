package com.javatpoint.basic;

import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        System.out.println("Enter Number you want to print Fibbo series");
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();
        if (input == 1) {
            System.out.println("Fibonacci of number is >> " + 0);
        } else if (input == 2) {
            System.out.println("Fibonacci of number is >> 0,1 ");
        } else if (input >= 3) {
            int oldnum = 0;
            int newnum = 1;
            System.out.print("Fibonacci of number is >> 0,1");
            for (int i = 1; i <= input - 2; i++) {
                int count = oldnum + newnum;
                oldnum = newnum;
                newnum = count;
                System.out.print("," + count);
            }
        } else {
            System.out.println("Number is -ve");
        }
    }
}
