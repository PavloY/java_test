package ua.splinestudio.sandbox.fibo.palindromes;

import java.util.Set;
import java.util.TreeSet;

public class PalindromeSequence {
  public PalindromeSequence(String input) {
    this.input = input;
  }

  private String input;
  private Set<String> setPalindrome;

  public Set<String> findPalindromes(String input) {
    setPalindrome = new TreeSet<>();
    for (int i = 0; i < input.length(); i++) {
      for (int j = i + 2; j <= input.length(); j++) {
        if (isPalindrome(input.substring(i, j))) {
          setPalindrome.add(input.substring(i, j));
        }
      }
    }
    return setPalindrome;
  }

  public boolean isPalindrome(String input) {
    StringBuilder plain = new StringBuilder(input);
    StringBuilder reverse = plain.reverse();
    return (reverse.toString()).equals(input);
  }

  public Set<String> getPalindromes() {
    if (setPalindrome == null) {
      setPalindrome = findPalindromes(input);
    }
    return setPalindrome;
  }
}
