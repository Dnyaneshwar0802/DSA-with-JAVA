package com.javatpoint.basic;

import java.util.Scanner;

public class Palindrome {
    static int reverseNum(int num){
        System.out.println("inside");
    int revnum=0;
    while (num>0){
     int rem=num%10;
     revnum*=10;
     revnum+=rem;
     num-=rem;
     num/=10;
     //Better Version of this
       /* while (num != 0) {
            revnum = revnum * 10 + num % 10;
            num /= 10;
        }*/
    }
        return revnum;
    }
    public static void main(String[] args) {
        System.out.println("Enter number");
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        System.out.println("Enter");
        int reversedNumber=reverseNum(num);
        System.out.println(reversedNumber);
        if(num==reversedNumber)
            System.out.println("Entered Number is Palindrome");
        else System.out.println("NOT palindrome");
    }
}
