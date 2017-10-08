package com.javarush.task.task24.task2406;

import com.javarush.task.task23.task2305.*;
import com.javarush.task.task23.task2305.Solution;
import com.javarush.task.task24.task2405.SecondClass;

/**
 * Created by TRACTEL_RND on 20.08.2017.
 */
public class SeparateClass {

    public static void main(String[] args) {

        OuterClass oc = new OuterClass();
        OuterClass.InnerClass i = oc.new InnerClass("Tasmania");
        System.out.println(i.readLabel());
    }

}
