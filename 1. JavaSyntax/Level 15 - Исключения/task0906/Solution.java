package com.javarush.task.jdk13.task09.task0906;

/* 
Логирование стек трейса
*/

public class Solution {

    public static void main(String[] args) {
        log("In method");
    }

    public static void log(String text) {
        //напишите тут ваш код
        StackTraceElement[] element = Thread.currentThread().getStackTrace();
        String className = element[2].getClassName();
        String methodName = element[2].getMethodName();
        String message = className + ": " + methodName + ": " + text;
        System.out.println(message);
    }
}
