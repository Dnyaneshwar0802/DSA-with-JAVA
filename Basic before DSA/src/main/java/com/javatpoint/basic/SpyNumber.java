package com.javatpoint.basic;

import java.util.Scanner;

//6.Spy Number in Java
public class SpyNumber {
    public static void main(String[] args) {
        System.out.println("Enter Number to check is that Spy number");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int sum = 0, prod = 1;
        while (num > 0) {
            int rem = num % 10;
            sum += rem;
            prod *= rem;
            num = (num - rem) / 10;
        }
        System.out.println("Sum is >>" + sum);
        System.out.println("Product is >>" + prod);
        if (prod == sum)
            System.out.println("Number is SPY number");
        else
            System.out.println("Number is Not SPY Number");
    }
}
