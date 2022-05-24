package com.javarush.task.jdk13.task08.task0818;

import java.util.HashMap;
import java.util.Map;

/* 
Налоговая и зарплаты
*/

public class Solution {
    public static Map<String, Integer> createMap() {
        //напишите тут ваш код
        Map<String, Integer> map = new HashMap<>();
        map.put("Сталлоне", 500);
        map.put("Марчук", 200);
        map.put("Филипчук", 300);
        map.put("Хотянович",400);
        map.put("Кудрявцев", 700);
        map.put("Якутович", 800);
        map.put("Лещенко", 900);
        map.put("Бордин", 1000);
        map.put("Осипов", 1100);
        map.put("Грудницкий", 1300);

        return map;
    }

    public static void removeItemFromMap(Map<String, Integer> map) {
        //напишите тут ваш код
        Map<String, Integer> copy = new HashMap<>(map);
        for (String key : copy.keySet()) {
            if (copy.get(key) < 500) {
                map.remove(key);
            }
        }
    }

    public static void main(String[] args) {

    }
}