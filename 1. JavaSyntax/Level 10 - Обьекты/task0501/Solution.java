package com.javarush.task.jdk13.task05.task0501;

/* 
Кошачья бойня(1)
*/

public class Solution {
    public static void main(String[] args) {
        Cat petya = new Cat("Petya",1,2,3);
        Cat vasya = new Cat("Vasya",2,3,4);;
        Cat egor = new Cat("Egor",5,6,7);;
    }

    public static class Cat {
        String name;
        int age;
        int weight;
        int strength;

        public Cat(String name, int age, int weight, int strength) {
            this.name = name;
            this.age = age;
            this.weight = weight;
            this.strength = strength;
        }
    }
}
