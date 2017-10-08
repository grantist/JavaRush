package com.javarush.task.task23.task2311;

/**
 * Created by TRACTEL_RND on 14.08.2017.
 */
public class TestAnonym {

    private static Runnable anon;
    private static Runnable anon2;
    private static Runnable anon3;
    public static void main(String[] args) {
        anon = new Runnable() {
            public void run() {
                while(true){
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        };
        anon2 = new Runnable() {
            public void run() {
                while(true){
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        };
        anon3 = new Runnable() {
            public void run() {
                while(true){
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        };

        System.out.println(anon.getClass().getName());
        TestAnonym.InnClass inn = new TestAnonym().new InnClass();
        System.out.println(inn.r.getClass().getName());
        InnStaticClass isc = new InnStaticClass();
        System.out.println(isc.r.getClass().getName());
    }

    class InnClass{
        public Runnable r = new Runnable() {
            public void run() {
                System.out.println("Hello from InnClass");
            }
        };
    }

    static class InnStaticClass{
        public Runnable r = new Runnable() {
            public void run() {
                System.out.println("Hello from InnStaticClass");
            }
        };
    }
}


