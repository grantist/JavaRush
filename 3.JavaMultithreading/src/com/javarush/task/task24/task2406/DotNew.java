package com.javarush.task.task24.task2406;

/**
 * Created by TRACTEL_RND on 20.08.2017.
 */
public class DotNew {

    public class Inner {}

    public static void main(String[] args) {
        DotNew dn = new DotNew();
        DotNew.Inner dni = dn.new Inner();
    }
}
