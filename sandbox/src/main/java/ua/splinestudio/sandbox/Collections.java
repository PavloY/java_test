package ua.splinestudio.sandbox;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Collections {
    public static void main(String[] args){

    String[] langs = { "Java" , "C#" , "Python" , "PHP"};
/*
        for (int i=0; i<langs.length; i++){
            System.out.println(langs[i]);

 */
   //     List<String> languages = new ArrayList<String>();
        List<String> languages = Arrays.asList("Java" , "C#" , "Python" , "PHP");

        for (String l : languages) {
            System.out.println(l);
        }

        for (int i =0; i<languages.size(); i++) {
            System.out.println(languages.get(i));
        }

        //инициализация масива
        String[] names= new String[3];

        //инициализация переменной
        int a = 10;

        //%s - строка
        //%d - целое число
        String str = "My name is %s! I am %d years old!";
        int age = 30;
        String name = "Ivan";
        System.out.println(str);
        System.out.println(String.format(str, name, age));





    }
}
