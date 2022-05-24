package com.javarush.task.jdk13.task08.task0815;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* 
Одинаковые имя и фамилия
*/

public class Solution {
    public static Map<String, String> createMap() {
        //напишите тут ваш код
        Map<String, String> map = new HashMap<>();
        map.put("Марчук", "Влад");
        map.put("Филипчук", "Костя");
        map.put("Хотянович", "Саша");
        map.put("Кудрявцев", "Антон");
        map.put("Якутович", "Дима");
        map.put("Лещенко", "Егор");
        map.put("Бордин", "Илья");
        map.put("Осипов", "Егор");
        map.put("Грудницкий", "Влад");
        map.put("Васильков", "Влад");

        return map;
    }

    public static int getCountTheSameFirstName(Map<String, String> map, String name) {
        return Collections.frequency(map.values(), name);

    }

    public static int getCountTheSameLastName(Map<String, String> map, String lastName) {
        //напишите тут ваш код
        return Collections.frequency(map.keySet(), lastName);

    }

    public static void main(String[] args) {

    }
}
