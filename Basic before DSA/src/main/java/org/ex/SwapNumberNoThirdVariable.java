package org.ex;

public class SwapNumberNoThirdVariable {
    public static void main(String[] args) {
        int a=60,b=90;
        System.out.println("Before swap a>>"+a +" << Before swap b >>"+b);
        a=a+b;
        b=a-b;
        a=a-b;
        System.out.println("After swap a>>"+a +" << After swap b >>"+b);
    }
}
