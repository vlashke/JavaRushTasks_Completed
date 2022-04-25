package com.javarush.task.jdk13.task04.task0423;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

/* 
И 18-ти достаточно
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        int age = scanner.nextInt();
        if (age > 20)
            System.out.println("И 18-ти достаточно");

    }
}
