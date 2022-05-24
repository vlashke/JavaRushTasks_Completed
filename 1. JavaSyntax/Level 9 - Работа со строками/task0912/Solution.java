package com.javarush.task.pro.task09.task0912;

/* 
Проверка URL-адреса
*/

public class Solution {
    public static void main(String[] args) {
        String[] urls = {"https://javarush.ru", "https://google.com", "http://wikipedia.org", "facebook.com", "https://instagram", "codegym.cc"};
        for (String url : urls) {
            String protocol = checkProtocol(url);
            String domain = checkDomain(url);

            System.out.println("У URL-адреса - " + url + ", сетевой протокол - " + protocol + ", домен - " + domain);
        }
    }

    public static String checkProtocol(String url) {
        //напишите тут ваш код
        if (url.startsWith("http"))
            return url.substring(0, url.indexOf(":"));
        else
            return "неизвестный";
    }

    public static String checkDomain(String url) {
        //напишите тут ваш код
        if (url.contains(".com")||url.contains(".net")||url.contains(".org")||url.contains(".ru"))
            return url.substring(url.indexOf(".")+1);
        else
            return "неизвестный";
    }
}
