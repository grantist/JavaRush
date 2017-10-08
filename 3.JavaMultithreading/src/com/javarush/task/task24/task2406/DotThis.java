package com.javarush.task.task24.task2406;

import com.javarush.task.task24.task2403.*;
import com.javarush.task.task24.task2403.Solution;

/**
 * Created by TRACTEL_RND on 20.08.2017.
 */
public class DotThis {
    void f() {
        System.out.println("DotThis.f()");}

    public class Inner {

        public DotThis outer() {
            return DotThis.this;
        }
    }

    public Inner inner() {return new Inner();}

    public static void main(String[] args) {
        DotThis dt = new DotThis();
        DotThis.Inner dti = dt.inner();
        dti.outer().f();
    }
    }



