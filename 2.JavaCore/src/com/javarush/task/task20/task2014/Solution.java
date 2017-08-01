package com.javarush.task.task20.task2014;

import java.io.*;
import java.text.SimpleDateFormat;
import java.util.Date;

/* 
Serializable Solution
*/
public class Solution {
    public static void main(String[] args) throws Exception {


          ObjectOutput oos = new ObjectOutputStream(new FileOutputStream("C://Users//TRACTEL_RND//Desktop//file3.txt"));
          ObjectInput ios = new ObjectInputStream(new FileInputStream("C://Users//TRACTEL_RND//Desktop//file3.txt"));

          Solution savedObject = new Solution(1);
          oos.writeObject(savedObject);
          oos.flush();
          oos.close();

            Solution loadedObject = new Solution(2);
           loadedObject = (Solution) ios.readObject();
           ios.close();

        System.out.println(savedObject.string);
        System.out.println(loadedObject.string);
        System.out.println(savedObject.string.equals(loadedObject.string));
        System.out.println(new Solution(4));
    }

    transient private final String pattern = "dd MMMM yyyy, EEEE";
   transient private Date currentDate;
    transient private int temperature;
    String string;

    public Solution(int temperature) {
        this.currentDate = new Date();
        this.temperature = temperature;

        string = "Today is %s, and current temperature is %s C";
        SimpleDateFormat format = new SimpleDateFormat(pattern);
        this.string = String.format(string, format.format(currentDate), temperature);
    }

    @Override
    public String toString() {
        return this.string;
    }


}