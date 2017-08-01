package com.javarush.task.task21.task2101;
import java.util.Arrays;

import com.sun.org.apache.xpath.internal.SourceTree;

/**
 * Created by TRACTEL_RND on 01.04.2017.
 */
public class Test {

    public static void main(String[] args) {
        byte[] ip = new byte[]{(byte) 192, (byte) 168, 1, 2};
        byte[] mask = new byte[]{(byte) 255, (byte) 255, (byte) 254, 0};
        int [] ipInt = new int [4];

        int c = 168;
        byte d = (byte) c;

        System.out.println(c);
        System.out.println(d);


    }
}