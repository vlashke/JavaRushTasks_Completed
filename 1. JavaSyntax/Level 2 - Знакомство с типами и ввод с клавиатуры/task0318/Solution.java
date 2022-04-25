package com.javarush.task.jdk13.task03.task0318;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;
/* 
Как захватить мир
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        Scanner scanner = new Scanner(System.in);
        String name = scanner.next();
        int age = scanner.nextInt();
        System.out.println("Через "+age+" лет " +name+ " захватит мир. Му-ха-ха!");
    }
}
