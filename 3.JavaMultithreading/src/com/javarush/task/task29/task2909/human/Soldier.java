package com.javarush.task.task29.task2909.human;

/**
 * Created by TRACTEL_RND on 07.11.2017.
 */
public class Soldier extends Human {

    protected boolean isSoldier;


    public Soldier(String name, int age) {
       super(name,age);
    }



    public void fight() //пустой метод,будет переопредел в классах наследниках
    {
    }

    public void live() // если isSoldier==TRUE т.е студент Солдат->запускается метод fight()
    {
        fight();
    }

}
