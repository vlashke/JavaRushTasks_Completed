package com.javarush.task.jdk13.task04.task0435;

/* 
Четные числа
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        for (int i = 1; i <= 100; i++) {
            if ((i % 2)==0){
                System.out.print(i);
                if (i < 100)
                System.out.print("\n");
            }
        }
    }
}
