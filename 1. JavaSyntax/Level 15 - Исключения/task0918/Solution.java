package com.javarush.task.jdk13.task09.task0918;
import java.io.IOException;
import java.sql.SQLException;

/* 
Создаем свои исключения
*/

public class Solution {
    public static void main(String[] args) {
    }

    static class MyException extends IOException{
    }

    static class MyException2 extends SQLException {
    }

    static class MyException3 extends NullPointerException{
    }

    static class MyException4 extends ArithmeticException{
    }
}

