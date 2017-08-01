package com.javarush.task.task19.task1925;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.BufferedWriter;

/*
Длинные слова
*/

import java.io.*;
import java.util.ArrayList;

public class Solution {
    public static void main(String[] args) throws IOException
    {
        BufferedReader reader = new BufferedReader(new FileReader(args[0]));
        BufferedWriter writer = new BufferedWriter(new FileWriter(args[1]));
        ArrayList<String> list = new ArrayList<String>();
        while (reader.ready())
        {
            String[] str = reader.readLine().split(" ");
            for (String g : str)
                if (g.length()>6) list.add(g);
        }
        String x = "";
        for (int i = 0; i < list.size()-1; i++)
            x += list.get(i)+",";
        x += list.get(list.size()-1);

        writer.write(x);
        reader.close();
        writer.close();
    }
}