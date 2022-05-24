package com.javarush.task.jdk13.task07.task0724;

/* 
Семья
*/

public class Solution {
    public static void main(String[] args) {
        // напишите тут ваш код
        Human babushka1= new Human("Аня", false, 55);
        Human babushka2 = new Human("Таня", false, 55);
        Human dedushka1 = new Human("Володя", true, 77);
        Human dedushka2 = new Human("Кирилл", true, 54);
        Human dad = new Human("Коля", true, 38, dedushka1, babushka1);
        Human mom = new Human("Настя", false, 25, dedushka2, babushka2);
        Human child1 = new Human("Арсений", true, 17, dad, mom);
        Human child2 = new Human("Сергей", true, 9, dad, mom);
        Human child3 = new Human("Влад", true, 3, dad, mom);

        System.out.println(babushka1);
        System.out.println(babushka2);
        System.out.println(dedushka1);
        System.out.println(dedushka2);
        System.out.println(dad);
        System.out.println(mom);
        System.out.println(child1);
        System.out.println(child2);
        System.out.println(child3);
    }

    public static class Human {
        // напишите тут ваш код
        String name;
        boolean sex;
        int age;
        Human father;
        Human mother;

        public Human(String name, boolean sex, int age, Human father, Human mother) {
            this.name = name;
            this.sex = sex;
            this.age = age;
            this.father = father;
            this.mother = mother;
        }

        public Human(String name, boolean sex, int age) {
            this.name = name;
            this.sex = sex;
            this.age = age;
            this.father = null;
            this.mother = null;
        }

        public String toString() {
            String text = "";
            text += "Имя: " + this.name;
            text += ", пол: " + (this.sex ? "мужской" : "женский");
            text += ", возраст: " + this.age;

            if (this.father != null) {
                text += ", отец: " + this.father.name;
            }

            if (this.mother != null) {
                text += ", мать: " + this.mother.name;
            }

            return text;
        }
    }
}