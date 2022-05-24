package com.javarush.task.pro.task09.task0906;

import java.util.regex.Pattern;

/* 
Двоичный конвертер
*/

public class Solution {
    public static void main(String[] args) {
        int decimalNumber = Integer.MAX_VALUE;
        System.out.println("Десятичное число " + decimalNumber + " равно двоичному числу " + toBinary(decimalNumber));
        String binaryNumber = "1111111111111111111111111111111";
        System.out.println("Двоичное число " + binaryNumber + " равно десятичному числу " + toDecimal(binaryNumber));
    }

    public static String toBinary(int decimalNumber) {
        //напишите тут ваш код
        String two = "";
        if (decimalNumber > 0) {
            while (decimalNumber != 0) {
                two = (decimalNumber % 2) + two;
                decimalNumber = decimalNumber / 2;
            }
            return two;
        } else
            return two;
    }

    public static int toDecimal(String binaryNumber) {
        //напишите тут ваш код
        if (binaryNumber == null || binaryNumber.isEmpty()) {
            return 0;
        } else {
            int ten = 0;
            for (int i = 0; i < binaryNumber.length(); i++) {
                int index = binaryNumber.length() - 1 - i;
                int value = Character.getNumericValue(binaryNumber.charAt(index));
                ten = (int)(ten + value * Math.pow(2, i));
            }
            return ten;
        }

    }
}

