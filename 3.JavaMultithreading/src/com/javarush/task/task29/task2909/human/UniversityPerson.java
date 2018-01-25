package com.javarush.task.task29.task2909.human;

/**
 * Created by TRACTEL_RND on 07.11.2017.
 */
public class UniversityPerson extends Human{

    public UniversityPerson(String name, int age) {
        super(name, age);

    }

    private University university; //название университета

    public University getUniversity() {
        return university;
    }

    public void setUniversity(University university) {
        this.university = university;
    }
}
