package com.javarush.task.pro.task06.task0609;


/* 
Кубический калькулятор в кубе
*/
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        System.out.println(ninthDegree(number));
    }

    //напишите тут ваш код
    public static long cube(long a){
        return a*a*a;
    }

    public static long ninthDegree(long a){
        return cube(cube(a));
    }

}
