package com.javarush.task.jdk13.task04.task0437;

/* 
Рисуем треугольник
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        int length = 8;

        for (int i = 1; i <= 10; i++) {
            for (int y = 1; y <= i; y++) {
                System.out.print(length);
            }
            if (i < 10) {
                System.out.println();
            }
        }
    }
}
