package com.javarush.task.jdk13.task06.task0609;

/* 
Расстояние между двумя точками
*/

public class Util {
    public static double getDistance(int x1, int y1, int x2, int y2) {
        //напишите тут ваш код
        return Math.sqrt((Math.pow((x1-x2),2))+(Math.pow((y1-y2),2)));
    }

    public static void main(String[] args) {

    }
}
