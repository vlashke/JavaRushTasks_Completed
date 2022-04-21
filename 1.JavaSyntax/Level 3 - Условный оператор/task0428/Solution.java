package com.javarush.task.jdk13.task04.task0428;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

/* 
Положительные числа
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        Scanner scanner = new Scanner(System.in);
        int numb1 = scanner.nextInt();
        int numb2 = scanner.nextInt();
        int numb3 = scanner.nextInt();
        int counter = 0;

        if (numb1 > 0)
            counter++;
        if (numb2 > 0)
            counter++;
        if (numb3 > 0)
            counter++;
        System.out.println(counter);

    }
}
