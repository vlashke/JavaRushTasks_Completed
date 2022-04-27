package com.javarush.task.jdk13.task07.task0706;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

/* 
Улица и дома
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        //напишите тут ваш код
        Scanner scanner = new Scanner(System.in);
        int chet = 0;
        int nechet = 0;
        int[] array = new int[15];
        for (int i = 0; i < array.length; i++) {
            array[i] = scanner.nextInt();
            if (i % 2 != 0)
                nechet = array[i]+nechet;
            else
                chet = array[i]+chet;
        }
        if (chet > nechet)
            System.out.println("В домах с четными номерами проживает больше жителей.");
        else if (chet < nechet)
            System.out.println("В домах с нечетными номерами проживает больше жителей.");
        else if (nechet==chet)
            return;
    }
}
