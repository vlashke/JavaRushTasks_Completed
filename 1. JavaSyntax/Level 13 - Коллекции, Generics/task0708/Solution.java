package com.javarush.task.jdk13.task07.task0708;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

/* 
Самое большое число
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> list = new ArrayList<>();
        int[] minimal = new int[5];
        for (int i = 0; i < 5; i++) {
            list.add(reader.readLine());
            minimal[i]=(list.get(i)).length();
        }
        Arrays.sort(minimal);
        for (int i = 0; i < list.size(); i++) {
            if ((list.get(i)).length() == minimal[0])
                System.out.println(list.get(i));
        }
    }
}