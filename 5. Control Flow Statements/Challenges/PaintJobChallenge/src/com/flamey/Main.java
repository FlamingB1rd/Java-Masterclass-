package com.flamey;

public class Main {

    public static void main(String[] args)
    {
        getBucketCount(3.4, 2.1, 1.5, 2 );
    }

    public static int getBucketCount(double width, double height, double areaPerBucket, int extraBuckets)
    {
        if(width <= 0 || height <= 0 || areaPerBucket <= 0 || extraBuckets < 0)
        {
            return -1;
        }

        double area = width * height;
        int buckets = extraBuckets;
        double paintedArea = buckets * areaPerBucket;

        while (paintedArea < area)
        {
            buckets++;
            paintedArea = buckets * areaPerBucket;
        }

        return buckets - extraBuckets;
    }

    public static int getBucketCount(double width, double height, double areaPerBucket)
    {
        if(width <= 0 || height <= 0 || areaPerBucket <= 0)
        {
            return -1;
        }

        double area = width * height;
        int buckets = 0;
        double paintedArea = 0;

        while (paintedArea < area)
        {
            buckets++;
            paintedArea = buckets * areaPerBucket;
        }

        return buckets;
    }

    public static int getBucketCount (double area, double areaPerBucket)
    {
        if(area <= 0 || areaPerBucket <= 0)
        {
            return -1;
        }

        int buckets = 0;
        double paintedArea = 0;

        while (paintedArea < area)
        {
            buckets++;
            paintedArea = buckets * areaPerBucket;
        }

        return buckets;
    }
}
