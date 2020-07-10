package com.flamey;

//Write a method named sumFirstAndLastDigit with one parameter of type int called number.
//The method needs to find the first and the last digit of the parameter number passed to the method, using a loop and return the sum of the first and the last digit of that number.
//If the number is negative then the method needs to return -1 to indicate an invalid value.
//Example input/output
//        * sumFirstAndLastDigit(252); → should return 4, the first digit is 2 and the last is 2 which gives us 2+2 and the sum is 4.
//        * sumFirstAndLastDigit(257); → should return 9, the first digit is 2 and the last is 7 which gives us 2+7 and the sum is 9.

public class Main {

    public static void main(String[] args)
    {

    }

    public static int sumFirstAndLastDigit (int number)
    {
        if(number < 0)
        {
            return -1;
        }

        int firstDigit = 0;
        int lastDigit = number % 10;

        while (number != 0)
        {
            firstDigit = number;
            number /= 10;
        }

        return firstDigit + lastDigit;

    }
}
