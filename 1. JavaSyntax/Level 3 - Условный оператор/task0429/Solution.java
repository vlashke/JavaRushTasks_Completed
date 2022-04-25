package com.javarush.task.jdk13.task04.task0429;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

/* 
Положительные и отрицательные числа
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        Scanner scanner = new Scanner(System.in);
        int numb1 = scanner.nextInt();
        int numb2 = scanner.nextInt();
        int numb3 = scanner.nextInt();
        int posCounter = 0;
        int negCounter = 0;

        if (numb1 > 0)
            posCounter++;
        else if (numb1 < 0)
            negCounter++;
        if (numb2 > 0)
            posCounter++;
        else if (numb2 < 0)
            negCounter++;
        if (numb3 > 0)
            posCounter++;
        else if (numb3 < 0)
            negCounter++;
        System.out.println("количество отрицательных чисел: "+ negCounter);
        System.out.println("количество положительных чисел: "+ posCounter);

    }
}
