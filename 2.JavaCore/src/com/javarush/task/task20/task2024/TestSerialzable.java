package com.javarush.task.task20.task2024;

import java.io.Serializable;
import java.io.*;

/**
 * Created by TRACTEL_RND on 27.03.2017.
 */
public class TestSerialzable implements Serializable {

    public static void main(String[] args) throws Exception{

        TestSerialzable t = new TestSerialzable();
        String s = "Привет, Страна!";
        ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("C:\\Users\\TRACTEL_RND\\Desktop\\file1.txt"));
        out.writeObject(s);
        out.close();


        ObjectInputStream in =  new ObjectInputStream (new FileInputStream("C:\\Users\\TRACTEL_RND\\Desktop\\file1.txt"));
        s = (String) in.readObject();
        in.close();
        System.out.println(s);

    }
}
