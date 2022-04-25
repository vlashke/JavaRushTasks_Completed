package com.javarush.task.jdk13.task04.task0413;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
День недели
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String toParse = reader.readLine();
        int dayofTheWeek = Integer.parseInt(toParse);
        if (dayofTheWeek < 1 || dayofTheWeek > 7)
            System.out.println("такого дня недели не существует");
        else if (dayofTheWeek == 1)
            System.out.println("понедельник");
        else if (dayofTheWeek == 2)
            System.out.println("вторник");
        else if (dayofTheWeek == 3)
            System.out.println("среда");
        else if (dayofTheWeek == 4)
            System.out.println("четверг");
        else if (dayofTheWeek == 5)
            System.out.println("пятница");
        else if (dayofTheWeek == 6)
            System.out.println("суббота");
        else if (dayofTheWeek == 7)
            System.out.println("воскресенье");

    }
}