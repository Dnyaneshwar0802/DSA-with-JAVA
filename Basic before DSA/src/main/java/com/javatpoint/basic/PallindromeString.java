package com.javatpoint.basic;

import java.util.Scanner;

public class PallindromeString {
    public static void main(String[] args) {
        System.out.println("Enter String");
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String reversedStr = reverseString(str);
        System.out.println(reversedStr);
        if (reversedStr.equals(str.toLowerCase()))
            System.out.println("String is Palindrom");
        else System.out.println("NOT PALINDROM !!");
    }

    private static String reverseString(String str) {
        str.toLowerCase();
        char[] ch = new char[str.length()];
        String rev = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            rev += str.charAt(i);
        }
        return rev;
    }
}
