package com.javarush.task.task29.task2909.human;


import javafx.scene.input.DataFormat;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Date;
import java.util.List;

public class Student extends UniversityPerson {
    private double averageGrade;// средняя оценка студента
    private Date beginningOfSession; //дата начала сессии
    private Date endOfSession;//дата конца сессии
    private int course;//курс

    @Override
    public String getPosition() {
        return "Студент";
    }

    public Student(String name, int age, double averageGrade) {
        super(name,age); //зпускает коснтрукт родительского класса Human
        this.name = name;
        this.age = age;
        this.averageGrade = averageGrade;
    }


    public void live() {
        learn();
    }

    public void learn() {
    }
    
    public int getCourse() {
        return course;
    }


    public void incAverageGrade(double delta) {

        setAverageGrade(getAverageGrade() + delta);
        

    }

    public void setCourse (int value){

            course = value;
        }


    public void setAverageGrade(double value) {
            averageGrade = value;
    }


    public void setBeginningOfSession(Date date) {
        beginningOfSession = date;
    } //устанавливает дату начала сессии

    public void setEndOfSession(Date date) {
        endOfSession = date;
    }
    //устанавливает дату конца сессии

    public double getAverageGrade() {

        return averageGrade;
    } //устанавилвает средний грейд
}