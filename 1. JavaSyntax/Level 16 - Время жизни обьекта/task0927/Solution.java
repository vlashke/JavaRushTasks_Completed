package com.javarush.task.jdk13.task09.task0927;

import java.util.*;

/* 
Десять котов
*/

public class Solution {

    public static void main(String[] args) {
        Map<String, Cat> map = createMap();
        Set<Cat> set = convertMapToSet(map);
        printCatSet(set);
    }

    public static Map<String, Cat> createMap() {
        Map<String,Cat> maps = new HashMap<>();
        maps.put("ириска", new Cat("ириска"));
        maps.put("турбо", new Cat("турбо"));
        maps.put("улитыч", new Cat("улитыч"));
        maps.put("пластерка", new Cat("пластерка"));
        maps.put("оскар", new Cat("оскар"));
        maps.put("коретка", new Cat("коретка"));
        maps.put("алкаш", new Cat("алкаш"));
        maps.put("косой", new Cat("косой"));
        maps.put("форсаж", new Cat("форсаж"));
        maps.put("иждевенец", new Cat("иждевенец"));
        
        return maps;
    }

    public static Set<Cat> convertMapToSet(Map<String, Cat> map) {
        //напишите тут ваш код
        return new HashSet<>(map.values());
    }

    public static void printCatSet(Set<Cat> set) {
        for (Cat cat : set) {
            System.out.println(cat);
        }
    }

    public static class Cat {
        public String name;

        public Cat(String name) {
            this.name = name;
        }

        public String toString() {
            return "Cat " + this.name;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) {
                return true;
            }
            if (!(o instanceof Cat)) {
                return false;
            }
            Cat cat = (Cat) o;
            return Objects.equals(name, cat.name);
        }

        @Override
        public int hashCode() {
            return Objects.hash(name);
        }
    }
}
