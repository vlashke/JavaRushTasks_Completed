package com.javarush.task.jdk13.task08.task0831;

import java.util.Arrays;

/* 
Любимые настолки
*/

public class Solution {

    public static BoardGame[] collection = new BoardGame[5];

    public static void main(String[] args) {
        collection[0] = new BoardGame();
        collection[0].name = "Шахматы";
        collection[1] = new BoardGame();;
        collection[1].name = "Что за мем?";
        collection[2] = new BoardGame();;
        collection[2].name = "Монополия";
        collection[3] = new BoardGame();;
        collection[3].name = "Что-то еще";
        collection[4] = new BoardGame();;
        collection[4].name = "И еще?";
        //напишите тут ваш код


        System.out.println(Arrays.toString(collection));
    }
}