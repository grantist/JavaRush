package com.javarush.test.level19.lesson10.home06;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class Solution {
    public static Map<Integer, String> map = new HashMap<Integer, String>();
    static
    {
        map.put(0, "ноль");
        map.put(1, "один");
        map.put(2, "два");
        map.put(3, "три");
        map.put(4, "четыре");
        map.put(5, "пять");
        map.put(6, "шесть");
        map.put(7, "семь");
        map.put(8, "восемь");
        map.put(9, "девять");
        map.put(10, "десять");
        map.put(11, "одиннадцать");
        map.put(12, "двенадцать");
    }
    public static void main(String[] args) throws Exception
    {
        BufferedReader readD = new BufferedReader(new InputStreamReader(System.in));
        String s = readD.readLine();
        readD.close();
        FileInputStream inP = new FileInputStream(s);
        byte [] buffer = new byte[inP.available()];
        inP.read(buffer);
        inP.close();
        String line = new String(buffer);
        String [] spl = line.split(" ");
        for(int i = 0; i <spl.length; i++)
        {
            for(Map.Entry<Integer, String> el : map.entrySet())
            {
                if(spl[i].equals(el.getKey().toString()))
                {
                    spl[i] = el.getValue();
                }
            }
        }
        String out = "";
        for(int i =0; i<spl.length; i++)
        {
            if(i == spl.length-1)
            {
                out = out + spl[i];
            } else
                out = out  + spl[i] + " ";
        }
        System.out.println(out);
    }
}