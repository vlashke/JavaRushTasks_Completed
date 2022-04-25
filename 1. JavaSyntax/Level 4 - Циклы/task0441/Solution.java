package com.javarush.task.jdk13.task04.task0441;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

/* 
Среднее такое среднее
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        Scanner scanner = new Scanner(System.in);
        int number1 = scanner.nextInt();
        int number2 = scanner.nextInt();
        int number3 = scanner.nextInt();
        int total = number1+number2+number3;
        int max = Math.max(Math.max(number1,number2),number3);
        int min = Math.min(Math.min(number1,number2),number3);
        int middle = total - (max+min);
        System.out.println(middle);

    }
}
