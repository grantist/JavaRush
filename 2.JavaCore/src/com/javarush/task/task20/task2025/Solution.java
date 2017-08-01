package com.javarush.task.task20.task2025;

import java.util.ArrayList;
import java.util.Arrays;

/*
Алгоритмы-числа
*/
public class Solution {

    /* public static long[] getNumbers(long N)
     {
         long[] result = null;
         long sum2=0;
         ArrayList array = new ArrayList();
         while(N>0) {
             array.add(0, N%10);
             N = N / 10;
         }
         for (int i=0;i<array.size();i++) {

             long sum = binpow((long)array.get(i), array.size());
             sum2 =sum2+sum;
         }
       for (int j=0;j<N;j++)
         if (sum2==N) {
             result[j]=sum2;
         }
         Arrays.sort(result);
         return result;

     }
*/
    public static long binpow(long a, long n) {
        if (n == 0)
            return 1;
        if (n % 2 == 1)
            return binpow(a, n - 1) * a;
        else {
            long b = binpow(a, n / 2);
            return b * b;
        }
    }

    public static void main(String[] args) {

        long N = 8208;
        long[] result = null;
        long sum = 0;
        long sum2 = 0;

        ArrayList<Long> arr = new ArrayList();
        StringBuilder s = new StringBuilder();
        for (long i = N; i > 0; i--) {
            arr.add(0, i % 10);
            i = i / 10;
            for (int j = 0; j < arr.size(); j++) {
                sum = binpow(arr.get(j), arr.size());
                sum2 = sum2 + sum;
            }
                if (sum2 == i) {
                    for (int k = 0; k < result.length; k++) {
                        result[k] = sum2;
                        System.out.println(result[k]);
                    }
                    arr.clear();
                }
            }
        }
    }






















