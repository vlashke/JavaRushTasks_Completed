package com.javarush.task.jdk13.task07.task0705;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

/* 
Один большой массив и два маленьких
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        Scanner scanner = new Scanner(System.in);
        int[] array20 = new int[20];
        int[] array10_1 = new int[10];
        int[] array10_2 = new int[10];
        for (int i = 0; i < array20.length; i++) {
            array20[i] = scanner.nextInt();
            if (i > (array20.length/2) -1)
                array10_2[i-(array20.length/2)] = array20[i];
            else
                array10_1[i] = array20[i];
        }
        for(int value : array10_2)
        System.out.println(value);
    }
}
