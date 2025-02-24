package com.javatpoint.basic;

import java.util.Scanner;
//4.Armstrong Number in Java
/*153: 13 + 53 + 33 = 1 + 125+ 27 = 153
  125: 13 + 23 + 53 = 1 + 8 + 125 = 134 (Not an Armstrong Number)*/
public class ArmStrongNumber {
    static int digitCheck(int num){
        int digit=0;
        while (num>0){
            int rem=num%10;
            num=(num-rem)/10;
            digit++;
            //   System.out.println(num);
        }
        return digit;
    }
    static int armStrongCheck(int num,int digit){
        int sum=0;
        while (num>0){
            int rem=num%10;
            num=(num-rem)/10;
            int temp=1;
            for(int i=1;i<=digit;i++){
                temp=temp*rem;
                //  System.out.println("Temp"+temp);
            }
            sum+=temp;
        }
        return sum;
    }
    public static void main(String[] args) {
        System.out.println("Enter Number to Check ArmStrong Number");
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        int digit=digitCheck(num);
       // System.out.println(digit);
        int sum=armStrongCheck(num,digit);
       if(sum==num)
           System.out.println("Entered Number is Armstrong Number");
       else
           System.out.println("Entered Number is Not Armstrong Number");
    }
}
