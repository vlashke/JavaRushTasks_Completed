package com.javarush.task.jdk13.task04.task0432;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

/* 
Хорошего не бывает много
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        Scanner scanner = new Scanner(System.in);
        String line = scanner.nextLine();
        int N = scanner.nextInt();
        int condition = 0;

        while (condition < N){
            System.out.println(line);
            condition++;
        }

    }
}
