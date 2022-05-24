package com.javarush.task.jdk13.task07.task0707;

import java.util.ArrayList;

/* 
5 различных строк в списке
*/

public class Solution {

    public static ArrayList<String> list;

    public static void main(String[] args) {
        //напишите тут ваш код
        list = new ArrayList<>();
        list.add("hello");
        list.add("love");
        list.add("you");
        list.add("mmm");
        list.add("yeah");
        System.out.println(list.size());
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }
}