package com.javatpoint.basic;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        System.out.println("Enter Number you want to see factorial !!");
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        int fact=1;
        if(num>=1){
        for(int i=1;i<=num;i++){
        fact*=i;
        }
            System.out.println("Factorial >> "+fact);
        }else System.out.println("Invalid number");
    }
}
