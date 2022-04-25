package com.javarush.task.jdk13.task04.task0442;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

/* 
Суммирование
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        Scanner scanner = new Scanner(System.in);
        int total = 0;
        while (true){
            int number = scanner.nextInt();
            total = total + number;
            if (number == -1){
                System.out.print(total);
                break;
            }
        }

    }
}
