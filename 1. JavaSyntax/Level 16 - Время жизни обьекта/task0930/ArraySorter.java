package com.javarush.task.jdk13.task09.task0930;

public class ArraySorter {

    public void sort(String[] array) {
        //напишите тут ваш код
        String temp;
        for (int i = 0; i < array.length; i++) {
            if (!isNumber(array[i])) {
                boolean isSorted = false;
                while (!isSorted) {
                    isSorted = true;
                    for (int j = 0; j < array.length; j++) {
                        if (isNumber(array[j]))
                            continue;
                        else {
                            if (isGreaterThan(array[j], array[i])) {
                                isSorted = false;
                                temp = array[i];
                                array[i] = array[j];
                                array[j] = temp;


                            }
                        }
                    }
                }
            } else {
                boolean isSorted = false;
                while (!isSorted) {
                    isSorted = true;
                    for (int j = 0; j < array.length; j++) {
                        if (!isNumber(array[j]))
                            continue;
                        else {
                            if (Integer.parseInt(array[i]) > Integer.parseInt(array[j])) {
                                isSorted = false;
                                temp = array[i];
                                array[i] = array[j];
                                array[j] = temp;


                            }
                        }
                    }
                }
            }
        }
    }

    // Метод для сравнения строк: 'а' больше чем 'b'
    public boolean isGreaterThan(String a, String b) {
        return a.compareTo(b) > 0;
    }


    // Переданная строка - это число?
    public boolean isNumber(String text) {
        if (text.length() == 0) {
            return false;
        }

        char[] chars = text.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            char character = chars[i];
            if ((i != 0 && character == '-') // Строка содержит '-'
                    || (!Character.isDigit(character) && character != '-') // или не цифра и не начинается с '-'
                    || (chars.length == 1 && character == '-')) // или одиночный '-'
            {
                return false;
            }
        }
        return true;
    }
}
