package com.javatpoint.basic;

import java.util.Scanner;

public class LargestofThreeNumbersTernary {
    public static void main(String[] args) {
        System.out.println("Enter First Number");
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        System.out.println("Enter Second Number");
        int num2 = sc.nextInt();
        System.out.println("Enter Third Number");
        int num3 = sc.nextInt();
        if (num1 == num2 && num2 == num3)
            System.out.println("All numbers Are equal");
        else {
            String str = (num1 >= num2 && num1 >= num3) ? "Number1 is Largest" : (num2 >= num1 && num2 >= num3) ? "Num2 is Largest " : "Num3 largest";

            System.out.println(str);
        }
    }
}
