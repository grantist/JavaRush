package com.javarush.task.task22.task2202;

import java.io.*;
/*
Найти подстроку
*/

public class Solution {

    static int count=0;
    public static void main(String[] args) {
        System.out.println(getPartOfString("JavaRush - лучший сервис обучения Java."));
        System.out.println(count);
    }

    public static String getPartOfString(String string) throws TooShortStringException

    {
        if (string==null) throw new TooShortStringException();
            String[] parts = string.split(" ");
            String res = "";

             int spaseCount = 0;
            int lastPartIndex = 5;
            for (char c : string.toCharArray()) if (c == ' ') spaseCount++;

            if (spaseCount < 4) throw new TooShortStringException();
            if (parts.length < 5) lastPartIndex = parts.length;
            for (int i = 1; i < lastPartIndex; i++)
                if (parts[i] != null) {
                    if (res.isEmpty()) res = parts[i];
                    else res = res + " " + parts[i];
                }
            return res;
        }


        public static class TooShortStringException extends RuntimeException {

        }
    }

