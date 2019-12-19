package ua.splinestudio.sandbox;

import java.util.ArrayList;
import java.util.List;

public class Collections {
    public static void main(String[] args){

    String[] langs = { "Java" , "C#" , "Python" , "PHP"};
/*
        for (int i=0; i<langs.length; i++){
            System.out.println(langs[i]);

 */
        List<String> languages = new ArrayList<String >();
        languages.add("Java");
        languages.add("C#");
        languages.add("Python");

        for (String l : langs) {
            System.out.println(l);

        }
    }
}
