package com.javarush.task.task20.task2017;

import com.sun.org.apache.xpath.internal.SourceTree;

import java.io.ObjectInputStream;
import java.io.Serializable;

/* 
Десериализация
*/
public class Solution {
    public A getOriginalObject(ObjectInputStream objectStream) {

        try {
            A rc2 = (A) objectStream.readObject();
            return rc2;

        }
        catch (Exception e) {

            System.out.println("Fuck!");

        }        return null;
    }

    public class A implements Serializable {
    }

    public class B extends A {
        public B() {
            System.out.println("inside B");
        }
    }

    public static void main(String[] args) {

    }
}
