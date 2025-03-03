package com.javatpoint.basic;

import java.util.Scanner;

//10.Krishnamurthy Number Java
/*example of Krishnamurthy number.

Number = 145
= 1! + 4! + 5!
= 1 + ( 4 * 3 * 2 * 1 ) + ( 5 * 4 * 3 * 2 * 1 )
= 1 + 24 + 120
= 145 */
public class Krishnamurthy {
    static int numCheck(int num){
        int sum=0;
        while (num>0){
            int rem=num%10;
            int prod=1;
            for(int i=1;i<=rem;i++){
                prod=prod*i;
            }
            sum=sum+prod;
            num=(num-rem)/10;
        }
        return sum;
    }
    public static void main(String[] args) {
        System.out.println("Enter Number to check");
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
    int sum=numCheck(num);
    if(sum==num){
        System.out.println("Number is Krishnamurty");
    }else {
        System.out.println("NOT Krishnamurty !!");
    }
    }
}
