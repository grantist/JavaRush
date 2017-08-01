package com.javarush.task.task20.task2003;

import java.io.*;
import java.util.Map;
import java.util.HashMap;
import java.util.Properties;
/* 
Знакомство с properties
*/
public class Solution {

    public static void main(String[] args) throws Exception {
        Solution sol = new Solution();
        sol.fillInPropertiesMap();
        FileOutputStream out=new FileOutputStream("C:\\Users\\TRACTEL_RND\\Desktop\\file2.txt");
        sol.save(out);
        out.close();
    }


    public static Map<String, String> properties = new HashMap<>();

    public static Properties props = new Properties();

    public void fillInPropertiesMap() throws Exception {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        FileInputStream fileProperties = new FileInputStream(bufferedReader.readLine());
        //cоздаем поток из которого будем считывать данные
        bufferedReader.close();
        load(fileProperties);
    }

    public void save(OutputStream outputStream) throws Exception {
        props.putAll(properties);
        props.store(outputStream, "Hello");

    }

    public void load(InputStream inputStream) throws Exception {
        props.load(inputStream);
        properties.putAll((Map) props);
    }


}