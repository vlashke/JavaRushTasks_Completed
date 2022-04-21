package com.javarush.task.jdk13.task04.task0427;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Строка - описание
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        String lengthOut = "однозначное";
        String chet = "нечетное";

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String toParse = reader.readLine();
        int numb = Integer.parseInt(toParse);
        String lengthParse = String.valueOf(numb);

        if (numb > 0 && numb < 1000) {
            if ((numb % 2) == 0) {
                chet = "четное";
                int lengthNumb = lengthParse.length();
                if (lengthNumb == 2)
                    lengthOut = "двузначное";
                else if (lengthNumb == 3)
                    lengthOut = "трехзначное";

            } else {
                int lengthNumb = lengthParse.length();
                if (lengthNumb == 2)
                    lengthOut = "двузначное";
                else if (lengthNumb == 3)
                    lengthOut = "трехзначное";
            }
            System.out.println(chet + " " + lengthOut + " число");
        }

    }
}
