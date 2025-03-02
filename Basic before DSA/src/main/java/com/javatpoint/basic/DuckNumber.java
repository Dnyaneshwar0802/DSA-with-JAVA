package com.javatpoint.basic;

import java.util.Scanner;

//8.Duck Number Java
public class DuckNumber {
    public static void main(String[] args) {
        System.out.println("Enter Number to check Duck Number or Not");
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        int flag=0;
        while (num>1){
            if(num/10==0){
               // System.out.println("Inside if /10 >>"+num);
                flag=1;
                System.out.println("Number is Duck Number");
                break;
            }else {
                int rem=num%10;
                num=(num-rem)/10;
            }

        }
        if (flag==0){
            System.out.println("Entered Number is not Duck Number");
        }
    }
}
