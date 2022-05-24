package com.javarush.task.jdk13.task05.task0510;

/* 
Кошкоинициация
*/

public class Cat {
    //напишите тут ваш код
    String name;
    int age;
    int weight;
    String address;
    String color;

    public void initialize(String name) {
        this.name = name;
        this.age = 1;
        this. weight = 1;
        this.color = "Black";
    }

    public void initialize(String name, int weight, int age) {
        this.name = name;
        this.weight = weight;
        this.age = age;
        this.color = "Black";
    }
    public void initialize(String name, int age) {
        this.name = name;
        this.weight = 15;
        this.age = age;
    }
    public void initialize(int weight, String color) {
        this.weight = weight;
        this.color = color;
        this.age = 1;
    }
    public void initialize(int weight, String color, String address) {
        this.weight = weight;
        this.color = color;
        this.age = 1;
        this.address = address;
    }

    public static void main(String[] args) {

    }
}
