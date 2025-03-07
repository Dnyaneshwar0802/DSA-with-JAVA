package com.javatpoint.basic;

import java.util.Scanner;

//11.Xylem and Phloem Number in Java
/*Xylem and Phloem Number
A number N will be a xylem number if the sum of its extreme (first and last) digits is equal
 to the sum of mean (all digits except first and last) digits.
 If the sum of extreme digits is not equal to the sum of mean digits,
 the number is called phloem number.
 Xylem Number

Sum of extreme digits = Sum of mean digits
Xylem Number

Sum of extreme digits ≠ Sum of mean digits
Enter a number: 825122
The sum of extreme digits: 10
The sum of mean digits: 10
825122 is a xylem number.*/
public class XylemAndPhloemNumber {
    static int countDigit(int num) {
        int count = 0;
        while (num > 0) {
            num = (num - (num % 10)) / 10;
            count++;
        }
        return count;
    }

    public static void main(String[] args) {
        System.out.println("Enter Number To check Xylem or Pheloem");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int count = countDigit(num);
        int sumofExtreme = 0;
        int sumofMean = 0;
        System.out.println(count);
        for (int i = 1; i <= count; i++) {

            if (i == 1 || i == count) {
                //     System.out.println("Extreme");
                sumofExtreme = sumofExtreme + (num % 10);

            } else {
//System.out.println("Inside Else");
                sumofMean = sumofMean + (num % 10);
            }
            num = (num - (num % 10)) / 10;
            System.out.println(num);
        }
        System.out.println(sumofMean + ">>" + sumofExtreme + ">>");
        if (sumofExtreme == sumofMean) {
            System.out.println("Number is Xylem Number");
        } else System.out.println("Number is  phloem number");

    }
}
