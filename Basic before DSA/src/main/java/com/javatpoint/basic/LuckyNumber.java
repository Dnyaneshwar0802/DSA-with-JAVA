package com.javatpoint.basic;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

//5.Lucky Number in Java
public class LuckyNumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        List<Integer> li=new LinkedList<Integer>();
        for(int i=1;i<=num;i++){
         li.add(i);
        }
        int i=1;
        while (li.size()>=i){

            for (int j=1;j<=li.size()-1;j++)
            {
                //System.out.println(j);
                if(j%i==0){

                li.remove(j);}
            }
            i++;
            System.out.println(li);
        }
    }
}
