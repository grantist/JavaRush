package com.javarush.task.task29.task2909.human;

import java.util.ArrayList;
import java.util.List;

public class Teacher extends UniversityPerson {
    private int numberOfStudents; // номер студентов

    @Override
    public String getPosition() {
        return "Преподаватель";
    }

    public Teacher(String name, int age, int numberOfStudents)
    {
       super(name,age);
        this.numberOfStudents=numberOfStudents;

    }


    public void live() //переопределнный мето live()
    {

        teach();
    }

    public void teach()  //метод teach() будет переопредел в классах наследниках
    {
    }

}