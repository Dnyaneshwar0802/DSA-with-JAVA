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


    public static void main(String[] args) {
        System.out.println("Enter Number To check Xylem or Pheloem");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
       // int count = countDigit(num);
       
    }
}
