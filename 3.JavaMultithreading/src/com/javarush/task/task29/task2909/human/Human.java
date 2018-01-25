package com.javarush.task.task29.task2909.human;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Human implements Alive {
    private List<Human> children = new ArrayList<>();// массив типа Human
    private static int nextId = 0; //следующией номер
    private int id;// номер
    protected int age;//возраст
    protected String name;//имя

    public Size size; //массив размеров

    private BloodGroup bloodGroup;

    public void setBloodGroup(BloodGroup bloodGroup) {
        this.bloodGroup = bloodGroup;
    }

    public BloodGroup getBloodGroup() {

        return bloodGroup;
    }

    public String getPosition() {
        return "Человек";
    }


    public Human(String name, int age)  //конструктор Human, запускается автоматические при создании объекта new Human()
    {
        this.name = name;
        this.age = age;
        this.id = nextId;
        nextId++;
    }

    public class Size {

        public int height;
        public int weight;

        public Size(int height, int weight) {
            this.height=height;
            this.weight=weight;

        }
        public int getHeight() {
            return height;
        }

        public int getWeight() {
            return weight;
        }
    }

    public void live(){

    }

    public int getAge() {
        return age;
    } //возвращет возраст

    public void setAge(int age) {
        this.age = age;
    } //устанавливает возраст

    public String getName() {
        return name;
    } //возвращет имя

    public void setName(String name) {
        this.name = name;
    }//устанавливает имя

    public int getId() {
        return id;
    } //получает индетификационной номр ID

    public List<Human> getChildren() {
        return Collections.unmodifiableList(children);
    }

    public void addChild(Human human) {
        children.add(human);

    }
    public void removeChild(Human human){
        children.remove(human);
    }

    public void printSize() {
        System.out.println("Рост: " + size.getHeight() + " Вес: " + size.getWeight());
    }// вывод в консоль Рост и Вес

    public void printData() {
        System.out.println(getPosition() + ": " + name);
    }

}