package com.flamey;

//Write a method isLeapYear with a parameter of type int named year.
//The parameter needs to be greater than or equal to 1 and less than or equal to 9999.
//If the parameter is not in that range return false.
//Otherwise, if it is in the valid range, calculate if the year is a leap year and return true if it is, otherwise return false.
//A year is a leap year if it is divisible by 4 but not by 100, or it is divisible by 400.


public class Main
{

    public static void main(String[] args)
    {
        System.out.println(getDaysInMonth(2, 2020));
    }

    public static boolean isLeapYear(int year)
    {
        if((year < 1) || (year > 9999))
        {
            return false;
        }
        else if(year % 4 == 0)
        {
            if(year % 100 == 0)
            {
                if(year % 400 == 0)
                {
                    return true;
                }
                else
                {
                    return false;
                }
            }
            else
            {
                return true;
            }
        }
        else
        {
            return false;
        }
    }

    public static int getDaysInMonth (int month, int year)
    {
        if((month < 1 || month > 12) || (year < 1 || year > 9999))
        {
            return -1;
        }

        switch (month)
        {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
            {
                return 31;
            }
            case 4:
            case 6:
            case 9:
            case 11:
            {
                return 30;
            }
            case 2:
            {
                if(isLeapYear(year))
                {
                    return 29;
                }
                else
                {
                    return 28;
                }
            }
        }
        return -1;
    }
}
