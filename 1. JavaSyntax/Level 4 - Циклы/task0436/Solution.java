package com.javarush.task.jdk13.task04.task0436;

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
        int m = scanner.nextInt();
        int n = scanner.nextInt();

        for (int i = 1; i <= m; i++) {
            for(int y=0; y < n; y++){
                System.out.print(8);
            }
            if (i<m)
            System.out.println();
        }
    }
}
