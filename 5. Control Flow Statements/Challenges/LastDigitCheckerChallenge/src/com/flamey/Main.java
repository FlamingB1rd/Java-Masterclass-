package com.flamey;

public class Main {

    public static void main(String[] args)
    {

    }

    public static boolean hasSameLastDigit (int num1, int num2, int num3)
    {
        if(!isValid(num1) || !isValid(num2) || !isValid(num3))
        {
            return false;
        }

        if(num1 % 10 == num2 % 10 || num1 % 10 == num3 % 10 || num2 % 10 == num3 % 10)
        {
            return true;
        }

        return false;
    }

    public static boolean isValid (int num)
    {
        if(num < 10 || num > 1000)
        {
            return false;
        }
        else
        {
            return true;
        }
    }
}
