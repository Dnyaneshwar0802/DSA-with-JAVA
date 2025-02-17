package com.javatpoint.basic;

import java.util.Scanner;

//Java program to find the sum of n natural numbers
public class SumOFNNaturalNum {
    public static void main(String[] args) {
        System.out.println("Enter Number you want to see Sum");
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        long sum = 0;
        for (int i = 0; i <= num; i++) {
            sum += i;
        }
        System.out.println("Sum is >>" + sum);
    }

}
