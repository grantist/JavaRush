package com.javarush.task.task24.task2406;

import java.util.StringTokenizer;

/**
 * Created by TRACTEL_RND on 20.08.2017.
 */
public class OuterClass {

    public class InnerClass{

        private String label;
        InnerClass(String whereTo) {label=whereTo;}
        String readLabel() {return label;}


    }
}
