package com.javatpoint.basic;
//Java program to find the sum of the first 100 natural numbers -loop,method
public class SumOfFirstHunNum {

    public static void main(String[] args) {
    int num=100;
    sumByLoop(num);
    }

    private static void sumByLoop(int num) {
        int sum=0;
        for(int i=1;i<=num;i++)
        {
          sum+=i;
        }
        System.out.println("Sum of 100 >>"+sum);
    }
}
