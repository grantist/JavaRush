package com.javarush.task.task19.task1926;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.FileReader;

/* 
Перевертыши
*/

public class Solution {
    public static void main(String[] args) throws Exception {

        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        String file = read.readLine();
        read.close();
        FileReader fr = new FileReader(file);
        BufferedReader reader = new BufferedReader(fr);
        String line = "";

        while ((line = reader.readLine()) != null) {
            StringBuffer buffer = new StringBuffer(line);
            buffer.reverse();
            System.out.println(buffer);
        }

  fr.close();
    }

}