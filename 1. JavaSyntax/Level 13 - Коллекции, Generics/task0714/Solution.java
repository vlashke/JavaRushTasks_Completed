package com.javarush.task.jdk13.task07.task0714;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Слова в обратном порядке
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> words = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            words.add(reader.readLine());
        }
        words.remove(2);
        for (int i = words.size()-1; i >= 0; i--) {
            System.out.println(words.get(i));
        }

    }
}
