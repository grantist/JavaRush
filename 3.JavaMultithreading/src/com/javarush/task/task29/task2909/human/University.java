package com.javarush.task.task29.task2909.human;
import java.util.ArrayList;
import java.util.List;

public class University  {

    private List<Student> students = new ArrayList<>();

    public String name;
    public int age;

    public void setStudents(List<Student> students) {
        this.students = students;
    }

    public List<Student> getStudents() {

        return students;
    }


    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {

        return name;
    }

    public int getAge() {
        return age;
    }

    public void setName(String name) {

        this.name = name;
    }

    public University(String name, int age) {

        this.name=name;
        this.age=age;  //вызваем коструктор класса Student
    }

    public Student getStudentWithAverageGrade(double averageGrade) //получить студента со средним гредом

    {
        Student student=new Student(name,age,averageGrade);
        for (int i=0;i<students.size();i++) {
            if (students.get(i).getAverageGrade()==averageGrade)
                student=students.get(i);
        }
        return student;
    }

    public Student getStudentWithMaxAverageGrade() //получить студента с максимальным грейдом
    {
        double max =0;
        int index=0;
        for (int i=0;i<students.size();i++) {
               if (students.get(i).getAverageGrade()>max) {
                   max=students.get(i).getAverageGrade();
                   index=i;
               }
        }

        return students.get(index);

    }

    public Student getStudentWithMinAverageGrade() ///получить студента с минимальным грейдом и выгнать его
    {
        double min=100;
        int index=0;

        for (int i=0;i<students.size();i++) {

            if (students.get(i).getAverageGrade()<min) {
                min=students.get(i).getAverageGrade();
                index=i;
            }
        }
        return students.get(index);
    }

    public void expel(Student student){

        students.remove(student);

    }
}