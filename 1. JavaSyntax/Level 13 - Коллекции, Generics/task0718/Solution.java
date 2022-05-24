package com.javarush.task.jdk13.task07.task0718;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Сортировка списка
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> list = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            list.add(reader.readLine());
        }
        ArrayList<String> copyList = new ArrayList<>(list);
        //сортировка
        for (int i = copyList.size() - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if (copyList.get(j).length() > copyList.get(j + 1).length()) {
                    String tmp = copyList.get(j);
                    copyList.set(j, copyList.get(j + 1));
                    copyList.set(j + 1, tmp);
                }
            }
        }

        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).length() == copyList.get(i).length()) {
                System.out.println(i);
                break;
            }
        }


    }
}

