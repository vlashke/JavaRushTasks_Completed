package com.javarush.task.pro.task05.task0510;

/* 
Треугольный массив
*/

public class Solution {

    public static int[][] result = new int[10][];

    public static void main(String[] args) {
        //напишите тут ваш код
        for (int i = 0; i < result.length; i++) {
            result[i] = new int[i + 1];
            for (int j = 0; j < (i + 1); j++) {
                result[i][j] = i + j;
                if (j < i)
                    System.out.print(result[i][j] + " ");
                else
                    System.out.print(result[i][j]);

            }
            System.out.println();
        }

    }
}