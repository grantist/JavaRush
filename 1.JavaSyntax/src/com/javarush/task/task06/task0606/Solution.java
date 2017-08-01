package com.javarush.task.task06.task0606;

import java.io.*;

/* 
Чётные и нечётные циферки
*/

public class Solution {

    public static int even;
    public static int odd;

    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String sNum = reader.readLine();
        int nNum = Integer.parseInt(sNum);

        for (int i = nNum; nNum > 0; nNum /= 10) {
            int p = nNum % 10;

            if (p % 2 == 0) {
                even++;
            }

            if (p % 2 != 0) {
                odd++;
            }

        }

        System.out.println("Even:" + " " + even + " " + "Odd: " + odd);
    }
}

