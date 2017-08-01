package com.javarush.task.task22.task2203;

import java.text.DecimalFormat;

/**
 * Created by TRACTEL_RND on 15.07.2017.
 */
public class Test {

    public static void main(String[] args) {

        DecimalFormat formatter = new DecimalFormat("0.00E00");

        String s = formatter.format(10.0/3.0);

        System.out.println(s);

    }


}
