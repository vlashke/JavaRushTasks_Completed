package com.javarush.task.jdk13.task03.task0319;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Зарплата через 5 лет
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String name = reader.readLine();
        String s_convert = reader.readLine();
        String y_convert = reader.readLine();
        int salary = Integer.parseInt(s_convert);
        int year = Integer.parseInt(y_convert);
        System.out.println(name+ " получает " +salary+ " через " +year+ " лет.");

    }
}
