package com.javatpoint.basic;

//Java program to find the sum of the first 100 natural numbers -recursion
public class SumOfFirstHunNumRecursion {
    public static void main(String[] args) {
        long l = sum(100, 0);
        System.out.println(l);
    }

    private static long sum(int i, long total) {
        total+=i;
        if (i > 0)
            return sum(i - 1, total);
        else
            System.out.println("ISIDE THIS");
            return total;
    }
}
