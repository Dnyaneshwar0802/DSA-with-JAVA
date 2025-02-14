package org.ex;

public class SwapNumber {
    public static void main(String[] args) {
        int a=10,b=20;
        System.out.println("Before swap a>>"+a +" << Before swap b >>"+b);
        int temp;
        temp=a;
        a=b;
        b=temp;
        System.out.println("After swap a>>"+a +" << After swap b >>"+b);
    }
}
