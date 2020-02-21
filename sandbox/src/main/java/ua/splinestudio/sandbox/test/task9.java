package ua.splinestudio.sandbox.test;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class task9 {
  public static void main(String[] args) {

    System.out.println(findAllPalindromesUsingBruteForceApproach("oleeloo"));
    System.out.println(findAllPalindromesUsingCenter("oleeloo"));

  }

  public static Set<String> findAllPalindromesUsingCenter(String input) {
    Set<String> palindromes = new HashSet<>();
    for (int i = 0; i < input.length(); i++) {
      palindromes.addAll(findPalindromes(input, i, i + 1));
      palindromes.addAll(findPalindromes(input, i, i));
    }
    return palindromes;
  }
  private static Set<String> findPalindromes(String input, int low, int high) {
    Set<String> result = new HashSet<>();
    while (low >= 0 && high < input.length() && input.charAt(low) == input.charAt(high)) {
      result.add(input.substring(low, high + 1));
      low--;
      high++;
    }
    return result;
  }

  public static String[] convert(Set<String> stringSet) {
    String[] s = stringSet.stream().toArray(String[]::new);
    return s;
  }

  public static Set<String> findAllPalindromesUsingBruteForceApproach(String input) {
    Set<String> palindromes = new HashSet<>();
    for (int i = 0; i < input.length(); i++) {
      for (int j = i + 1; j <= input.length(); j++) {
        if (isPalindrome(input.substring(i, j))) {
          palindromes.add(input.substring(i, j));
        }
      }
    }
    return palindromes;
  }

  public static boolean isPalindrome(String input) {
    StringBuilder plain = new StringBuilder(input);
    StringBuilder reverse = plain.reverse();
    return (reverse.toString()).equals(input);
  }

  public static void countDigits(String[] myListt) {

    ArrayList<String> max = new ArrayList<String>();
    for (int i = 1; i < myListt.length; i++) {
      if (getCountsOfDigits(myListt[i]) >= 2) max.add(String.valueOf(myListt[i]));
    }
    System.out.println("элементы: " + max);
  }

  public static int getCountsOfDigits(String number) {
    return String.valueOf(Math.abs(Integer.parseInt(String.valueOf(number)))).length();
  }
}




