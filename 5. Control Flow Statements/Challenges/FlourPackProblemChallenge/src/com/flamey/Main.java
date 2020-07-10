package com.flamey;

public class Main {

    public static void main(String[] args)
    {
	    canPack(1,0,5);
    }

    public static boolean canPack(int bigCount, int smallCount, int goal)
    {
        if(bigCount < 0 || smallCount < 0 || goal < 0)
        {
            return false;
        }

        for(int i = 0; i <= bigCount; i++)
        {
            for(int j = 0; j <= smallCount; j++)
            {
                if(i*5 + j*1 == goal) return true;
            }
        }
        return false;
    }
}
