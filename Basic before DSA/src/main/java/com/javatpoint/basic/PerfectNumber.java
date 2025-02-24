package com.javatpoint.basic;

import java.util.Scanner;

//2.Perfect Number Program in Java
//First, we find the factors of 496 i.e. 1, 2, 4, 8, 16, 31, 62, 124, and 248. Let's find the
// sum of factors (1 + 2 + 4 + 8 + 16 + 31 + 62 + 124 +248 = 496).
// We observe that the sum of factors is equal to the number itself
public class PerfectNumber {
    public static void main(String[] args) {
        System.out.println("Enter Number >>");
        Scanner sc =new Scanner(System.in);
        int num=sc.nextInt();
        int sum=0;
        for(int i=1;i<num;i++){
            if(num%i==0)
                sum+=i;
        }
        System.out.println(sum);
        if(sum==num)
            System.out.println("Entered Number is Perfect Number");
        else
            System.out.println("Number is not perfect number");
    }
}
