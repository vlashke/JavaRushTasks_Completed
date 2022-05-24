package com.javarush.task.jdk13.task09.task0926;

import java.util.Arrays;
import java.util.ArrayList;
import java.util.Random;

/* 
Список из массивов чисел
*/

public class Solution {

    public static void main(String[] args) {
        ArrayList<int[]> list = createList();
        printList(list);
    }

    public static ArrayList<int[]> createList() {
        //напишите тут ваш код
        ArrayList<int[]> list = new ArrayList<>();
        int[] lenght = new int[]{5,2,4,7,0};
        for (int i = 0; i < 5; i++) {
            list.add(new int[lenght[i]]);
        }

        for (int[] ints : list) {
            for (int i = 0; i < ints.length; i++) {
                ints[i] = new Random().nextInt(10);
            }
        }
        return list;
    }

    public static void printList(ArrayList<int[]> list) {
        for (int[] array : list) {
            System.out.println(Arrays.toString(array));
        }
    }
}
