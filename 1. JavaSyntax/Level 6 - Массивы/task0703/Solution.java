package com.javarush.task.jdk13.task07.task0703;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.io.IOException;

/* 
Два массива
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        //напишите тут ваш код
        Scanner scanner = new Scanner(System.in);
        int length;
        int[] intArray = new int[10];
        String[] stringArray = new String[10];
        for (int i = 0; i < stringArray.length; i++) {
            stringArray[i] = scanner.nextLine();
            length = stringArray[i].length();
            intArray[i] = length;
        }
        for(int value : intArray)
            System.out.println(value);
    }
}
