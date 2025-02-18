package com.javatpoint.basic;

import java.util.Scanner;

public class OddNumbersRecursion {
    public static void main(String[] args) {
        System.out.println("Enter Number to find ODDs to that number");
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        System.out.println("Odd Numbers Between 1-"+num+" is >>");
        if(num%2==0){
            num-=1;
        }
        DiplayOdd(1,num);
        System.out.println();
        System.out.println("Printing Odd using loop");
        for(int i=1;i<=num;i=i+2)
        {
            System.out.print(i+",");
        }
    }

    private static void DiplayOdd(int i, int num) {
        System.out.print(i + " ,");
        if(i<num)
            DiplayOdd(i+2,num);
    }
}
