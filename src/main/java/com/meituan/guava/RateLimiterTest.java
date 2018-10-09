package com.meituan.guava;

import com.google.common.base.Stopwatch;
import com.google.common.util.concurrent.RateLimiter;

import java.util.concurrent.TimeUnit;

public class RateLimiterTest {


    public static void main(String[] args) {
        RateLimiter rateLimiter = RateLimiter.create(5);


        Stopwatch stopwatch = Stopwatch.createStarted();




        for (int i = 0; i <= 100; i++) {

            double result = rateLimiter.acquire();

            System.out.println(result);

        }

        System.out.println("end,time is =" + stopwatch.elapsed(TimeUnit.MILLISECONDS));
    }
}
