package com.company;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args){
        Scanner vvod = new Scanner(System.in);//Ввод текста
        String str = vvod.nextLine();//Перевод введенного текста в строку
        String s[] = str.split(" ");//Делим строку на слова
        for (String i: s){
            System.out.println(i + " - " + isPalindrom(i));//Вывод полученного результата
        }
    }

    public static String reverseString(String s){
        String str = "";
        for (int i = 0; i < s.length(); i++){
            str = str + s.charAt(s.length()-1-i);//поворот слова
        }
        return str;
    }

    public static boolean isPalindrom (String s){
        String s_reverse = reverseString(s);
        return s.equals(s_reverse);//сравнение слов
    }

}