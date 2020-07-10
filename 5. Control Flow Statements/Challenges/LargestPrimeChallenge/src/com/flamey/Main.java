package com.flamey;

public class Main {


    //Find the largest prime factor number: 21 -> 3 * 7 -> 7
    public static void main(String[] args)
    {
        System.out.println(getLargestPrime(3543));
    }

    public static int getLargestPrime(int number)
    {
        if (number <= 1)
        {
            return -1;
        }

        int maxPrime = 0;

        for (int div = 2; div <= number; div++) {
            if (number % div == 0)
            {
                maxPrime = div;
                number /= div;
                div--;
            }
        }
        return maxPrime;
    }
}
