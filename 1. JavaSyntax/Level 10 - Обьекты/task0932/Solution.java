package com.javarush.task.jdk13.task09.task0932;
import java.util.StringTokenizer;

/* 
Количество слов в строке
*/

public class Solution {
    public static void main(String[] args) {
        String string = "Кто желает поработать?";
        int getWordCount = getWordCount(string);
        System.out.println("Количество слов в строке \"" + string + "\" равно " + getWordCount);
    }

    public static int getWordCount(String string) {
        //напишите тут ваш код
        int i = 0;
        StringTokenizer count = new StringTokenizer(string);
        return count.countTokens();
    }
}
