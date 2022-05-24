package com.javarush.task.jdk13.task08.task0817;

import java.util.HashMap;
import java.util.Map;

/* 
Удалить людей, имеющих одинаковые имена
*/

public class Solution {
    public static Map<String, String> createMap() {
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

    public static void removeTheFirstNameDuplicates(Map<String, String> map) {
        Map<String, String> copy = new HashMap<>(map);
        
        for (String name : copy.values()) {
            int count = 0;
            for (String nameTmp : map.values()) {
                if (nameTmp.equals(name)) {
                    count++;
                }
            }
            if (count > 1) {
                removeItemFromMapByValue(map, name);
            }
        }

    }

    public static void removeItemFromMapByValue(Map<String, String> map, String value) {
        Map<String, String> copy = new HashMap<>(map);
        for (Map.Entry<String, String> pair : copy.entrySet()) {
            if (pair.getValue().equals(value)) {
                map.remove(pair.getKey());
            }
        }
    }

    public static void main(String[] args) {

    }
}
