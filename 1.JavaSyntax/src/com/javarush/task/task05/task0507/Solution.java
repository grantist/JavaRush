package com.javarush.task.task05.task0507;
import java.io.*;

/* 
Среднее арифметическое
*/

public class Solution {
    public static void main(String[] args) throws Exception {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

         double res=0;
         int count=0;

        while(true) {
            String sNumber = reader.readLine();
            double nNumber = Double.parseDouble(sNumber);

            if (nNumber == -1) {
                break;
            }
            res += nNumber;
            count++;
        }
        System.out.println(res/count);
    }
}

