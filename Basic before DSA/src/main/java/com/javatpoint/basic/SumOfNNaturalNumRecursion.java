package com.javatpoint.basic;

import java.util.Scanner;

public class SumOfNNaturalNumRecursion {
    public static void main(String[] args) {
        System.out.println("Enter Number You want to see Sum");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        long total = 0;
       long l= sum(n,total);
        System.out.println("Sum >>"+l);
    }

    private static long sum(int n,long total) {
        total+=n;
        if(n>0)
            return sum(n-1,total);
        else
           return total;
    }
}
