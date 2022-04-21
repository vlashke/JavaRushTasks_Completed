package com.javarush.task.jdk13.task04.task0418;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

/* 
Минимум двух чисел
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        Scanner scanner = new Scanner(System.in);
        int firstNumb = scanner.nextInt();
        int secondNumb = scanner.nextInt();
        if (firstNumb==secondNumb)
            System.out.println(secondNumb);
        else
            System.out.println(Math.min(firstNumb,secondNumb));

    }
}