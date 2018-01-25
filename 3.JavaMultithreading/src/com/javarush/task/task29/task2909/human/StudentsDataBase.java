package com.javarush.task.task29.task2909.human;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class StudentsDataBase {
    public static List<Student> students = new ArrayList<>(); //массив типа Student


    public static void addInfoAboutStudent(Student student)  //добавляет информация о студентах и
    // выводит на экран Имя: Иванов Возраст: 22
    {
        students.add(student);
        printInfoAboutStudent(student);

    }

    public static void printInfoAboutStudent(Student student) {
        System.out.println("Имя: " + student.getName() + " Возраст: " + student.getAge());
    }

    public static void removeStudent(int index)  //удаляем студента из массива по Index
    {
        try {
            students.remove(index);
        } catch (Throwable throwable) {
            throwable.printStackTrace();
        }
    }

    public static void findDimaOrSasha() //метод который ищет студента по базе по имени
    {

        for (int i = 0; i < students.size(); i++) {

                if (students.get(i).getName().equals("Dima")) {
                    System.out.println("Студент Dima есть в базе.");
                    break;
                }

                if (students.get(i).getName().equals("Sasha")) {
                    System.out.println("Студент Sasha есть в базе.");
                    break;
                }
            }
        }
    }
