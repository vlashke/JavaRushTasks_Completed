package com.javarush.task.jdk13.task07.task0712;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Минимальное или максимальное
*/

public class Solution {

    public static ArrayList<String> strings;

    public static void main(String[] args) throws IOException {
        //напишите тут ваш код
        strings = new ArrayList<>();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i < 10; i++) {
            strings.add(reader.readLine());
        }
        int min = strings.get(0).length();
        int max = min;
        for (int i = 0; i < strings.size(); i++) {
            if (strings.get(i).length() < min)
                min = strings.get(i).length();
            else if (strings.get(i).length() > max)
                max = strings.get(i).length();
        }
        for (int i = 0; i < strings.size(); i++) {
            if (strings.get(i).length() == min || strings.get(i).length() == max) {
                System.out.println(strings.get(i));
                break;
            }
        }

    }
}
