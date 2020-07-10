package com.flamey;

public class Main {

    public static void main(String[] args)
    {
        System.out.println(getGreatestCommonDivisor(30, 12));
    }

    public static int getGreatestCommonDivisor(int first, int second)
    {
        if(first < 10 || second < 10)
        {
            return -1;
        }

        while (first != second)
        {
            if(first > second)
            {
                first -= second;
            }
            else
            {
                second -= first;
            }
        }
        return first;
    }
}
