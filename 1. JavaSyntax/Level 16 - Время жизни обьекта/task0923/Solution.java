package com.javarush.task.jdk13.task09.task0923;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Гласные и согласные буквы
*/

public class Solution {
    public static char[] vowels = new char[]{'а', 'я', 'у', 'ю', 'и', 'ы', 'э', 'е', 'о', 'ё'};

    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String line = reader.readLine();
        char [] lineToChar = line.toCharArray();
        for (int i = 0; i < lineToChar.length; i++) {
            if (isVowel(lineToChar[i]) && lineToChar[i] != ' '){
                System.out.print(lineToChar[i]+" ");
            }
        }

        System.out.println();

        for (int i = 0; i < lineToChar.length; i++) {
            if (!isVowel(lineToChar[i]) && lineToChar[i] != ' '){
                System.out.print(lineToChar[i]+ " ");
            }
        }
    }

    // метод проверяет, гласная ли буква
    public static boolean isVowel(char character) {
        character = Character.toLowerCase(character);  // приводим символ в нижний регистр - от заглавных к строчным буквам
        for (char vowel : vowels) {  // ищем среди массива гласных
            if (character == vowel) {
                return true;
            }
        }
        return false;
    }
}
