package com.javarush.task.jdk13.task04.task0434;

/* 
Таблица умножения
*/

public class Solution {
    public static void main(String[] args) {
        //напишите тут ваш код
       for (int i = 1; i <= 10; i++) {
            for (int y = 1; y <= 10; y++)
                System.out.print(y * i + " ");
            if (i < 10)
                System.out.println();
        }
}}
