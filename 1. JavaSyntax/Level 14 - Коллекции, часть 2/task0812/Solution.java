package com.javarush.task.jdk13.task08.task0812;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Iterator;

/* 
Cамая длинная последовательность
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<Integer> list = new ArrayList<>();
        Iterator<Integer> iterator = list.iterator();

        for (int i = 0; i < 10; i++) {
            list.add(Integer.parseInt(reader.readLine()));
        }
        int count = 1;
        int max = count;
        for (int i = 0; i < list.size(); i++) {
            if (i == 9){
                if(count > max){
                    max = count;
                }
                break;
            }
            else if (list.get(i).equals(list.get(i + 1)))
                count++;
            else if (!(list.get(i).equals(list.get(i + 1)))){
                if (count > max) {
                    max = count;
                }
                count = 1;
            }
        }
        System.out.println(max);
    }
}
