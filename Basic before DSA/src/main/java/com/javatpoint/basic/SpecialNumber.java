package com.javatpoint.basic;

import java.util.Scanner;
//Sum of factorial of digits = 1 + 24 + 120 = 145 145 is special number
public class SpecialNumber {
    public static void main(String[] args) {
        System.out.println("Enter Number you want to check Entered number is special number or not");
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        int sum=specialNumber(num);
        if(sum==num)
            System.out.println("Entered Number is Special");
        else
            System.out.println("NOT SPECIAL NUMBER");
    }

    private static int specialNumber(int num) {
        int sum=0;
        while (num>0){
            int rem=num%10;
            num=(num-rem)/10;
            System.out.println("New num >>>"+num);
            int fact=1;
           for(int i=1;i<=rem;i++){
            fact*=i;
           }
           sum+=fact;
        }
       return sum;
    }
}
