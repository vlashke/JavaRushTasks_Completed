package com.javarush.task.jdk13.task04.task0426;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Строка - описание
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        String chet = "нечетное";
        String positive = "отрицательное";

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String toParse = reader.readLine();
        int numb = Integer.parseInt(toParse);

        if (numb == 0)
            System.out.println("ноль");
        else if (numb > 0) {
            positive = "положительное";
            if ((numb % 2) == 0)
                chet = "четное";
            System.out.println(positive + " " + chet + " число");
        } else {
            if ((numb % 2) == 0)
                chet = "четное";
            System.out.println(positive + " " + chet + " число");
        }

    }
}
