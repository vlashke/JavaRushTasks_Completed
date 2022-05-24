package com.javarush.task.jdk13.task08.task0816;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.time.Month;
import java.util.*;

/* 
Удалить всех людей, родившихся летом
*/

public class Solution {
    public static Map<String, Date> createMap() throws ParseException {
        DateFormat dateFormat = new SimpleDateFormat("MMMMM d yyyy", Locale.ENGLISH);
        Map<String, Date> map = new HashMap<>();
        map.put("Сталлоне", dateFormat.parse("MAY 1 2012"));
        map.put("Марчук", dateFormat.parse("JUNE 2 2012"));
        map.put("Филипчук", dateFormat.parse("JULY 3 2012"));
        map.put("Хотянович",dateFormat.parse("AUGUST 4 2012"));
        map.put("Кудрявцев", dateFormat.parse("MAY 5 2012"));
        map.put("Якутович", dateFormat.parse("MAY 6 2012"));
        map.put("Лещенко", dateFormat.parse("MAY 7 2012"));
        map.put("Бордин", dateFormat.parse("MAY 8 2012"));
        map.put("Осипов", dateFormat.parse("MAY 9 2012"));
        map.put("Грудницкий", dateFormat.parse("MAY 10 2012"));

        return map;
    }

    public static void removeAllSummerPeople(Map<String, Date> map) {
        //напишите тут ваш код
        Integer[] mounthThree = { Month.JUNE.ordinal(), Month.JULY.ordinal(), Month.AUGUST.ordinal()};
        Set<Integer> mounthThreeSet = new HashSet<>(Arrays.asList(mounthThree));

        map.entrySet().removeIf( entry -> mounthThreeSet.contains(entry.getValue().getMonth()));

    }

    public static void main(String[] args) {

    }
}
