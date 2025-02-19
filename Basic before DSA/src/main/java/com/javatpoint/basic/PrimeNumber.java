package com.javatpoint.basic;

import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        System.out.println("Enter number to check prime or not");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        checkPrime(num);
    }

    private static void checkPrime(int num) {
        int flag = 0;
        if (num <= 1) {
            flag = 1;
            System.out.println("Number is not prime");
        } else if (num == 2)
            System.out.println("Number is prime");
        else

            for (int i = 2; i < num; i++) {
                if (num % i == 0) {
                    flag = 1;
                    break;
                }
            }
        if (flag == 1)
            System.out.println("Number is not prime");
        else System.out.println("Number is Prime");
    }
}
