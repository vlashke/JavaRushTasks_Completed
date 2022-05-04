package com.javarush.task.pro.task06.task0608;

/* 
Кубический калькулятор
*/
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        System.out.println(cube(number));
    }

    //напишите тут ваш код
    public static long cube(long number){
        return (long) Math.pow(number,3);
    }
}
