package com.flamey;

//Write a method called isPalindrome with one int parameter called number.
//The method needs to return a boolean.
//It should return true if the number is a palindrome number otherwise it should return false.
//Check the tips below for more info about palindromes.
//Example Input/Output
//        isPalindrome(-1221); → should return true
//        isPalindrome(707); → should return true

public class Main
{

    public static void main(String[] args)
    {
        System.out.println(isPalindrome(-1221));
        System.out.println(isPalindrome(707));
        System.out.println(isPalindrome(5));
        System.out.println(isPalindrome(45));
    }

    public static boolean isPalindrome(int number)
    {
        int comperatorHolder = number;
        int reverse = 0;
        int lastDigit = 0;

        while(number != 0)
        {
            lastDigit = number % 10;

            reverse *= 10;
            reverse += lastDigit;

            number /= 10;
        }

        return (reverse == comperatorHolder);
    }

}
