package com.javarush.task.jdk13.task07.task0702;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

/* 
Массив из строк в обратном порядке
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        Scanner scanner = new Scanner(System.in);
        String[] array = new String[10];
        for (int i = 0; i < 8; i++) {
            array[i] = scanner.nextLine();
        }
        for (int i = array.length-1; i >= 0; i--) {
            System.out.println(array[i]);
        }


    }
}