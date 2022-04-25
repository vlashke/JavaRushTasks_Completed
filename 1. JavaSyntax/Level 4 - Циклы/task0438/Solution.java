package com.javarush.task.jdk13.task04.task0438;

/* 
Рисуем линии
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        int length = 8;

        for (int i = 1; i <= 10; i++) {
            System.out.print(length);
        }
        System.out.println();
        for (int y = 1; y <= 10; y++) {
            if (y < 10)
                System.out.println(length);
            else
                System.out.print(length);
        }
    }
}
