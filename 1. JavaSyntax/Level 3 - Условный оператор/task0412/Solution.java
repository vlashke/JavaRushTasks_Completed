package com.javarush.task.jdk13.task04.task0412;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Положительное и отрицательное число
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String toParse = reader.readLine();
        int number = Integer.parseInt(toParse);
        if (number == 0) {
            System.out.println(number);
        }
        if (number < 0) {
            number++;
            System.out.println(number);
        }
        if (number > 0) {
            number = number * 2;
            System.out.println(number);
        }
        
    }

}