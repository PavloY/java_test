package ua.splinestudio.sandbox.test;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class task91 {
  public static void main(String[] args) {
/*
      Set<String> palindromes = new HashSet<>();
      String input = "123321";

      System.out.println(input.substring(0,3));

    if (isPalindrome(input.substring(1, 3))) {
      palindromes.add(input.substring(1, 3));
    }
    System.out.println(isPalindrome(input.substring(1, 3)));
    System.out.println(palindromes.add(input.substring(1, 3)));
*/

    int input = 123321;
    int revers = 0;
    System.out.println(input);
  //  System.out.println(((reverse) == (input)));

    System.out.println(issPalindrome(input));
  }
  public static ArrayList<Integer> findAllPalindromesUsingBruteForceApproach(String input) {
    ArrayList<Integer> palindromes =new ArrayList<Integer>();
    for (int i = 0; i < input.length(); i++) {
      for (int j = i + 1; j <= input.length(); j++) {
        if (isPalindrome(input.substring(i, j))) {
          palindromes.add(Integer.parseInt(input.substring(i, j)));
        }
      }
    }
    return palindromes;
  }


    public static boolean issPalindrome(int input) {
        int plain = input;
        int reverse = Integer.reverse(plain);
        return ((reverse) == (input));
  }



  public static boolean isPalindrome(String input) {
    StringBuilder plain = new StringBuilder(input);
    StringBuilder reverse = plain.reverse();
    // вернули тру если строка равна перевернутой строке
    return (reverse.toString()).equals(input);
  }

}
