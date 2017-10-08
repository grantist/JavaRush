package com.javarush.task.task23.task2311;

/**
 * Created by TRACTEL_RND on 17.08.2017.
 */
public class OuterClass {
    private String s;
    OuterClass (String s) {
        this.s=s;
    }
    class Inner {
        void toStr() { System.out.println(s);}
    }


    public static void main(String[] args) {




    }
}
