package ua.splinestudio.sandbox.fibo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.ListIterator;
import java.util.Scanner;

import static java.util.Collections.reverse;

public class Palindrom {

    public static void main(String[] args) {

      Scanner scanner = new Scanner(System.in);
      System.out.println("Palindrome Checker\nEnter a whole number, please:");
      String input = null;

      while (true) {
        input = scanner.nextLine();
        if (input.matches("\\d+")) {
          int number;
          number = Integer.parseInt(input);
          //int number = 10000021;
          System.out.println("Is " + number + " a palindrome? " + isPalindrome(number));
        } else {
          System.out.println("Error. That is incorrect input.");
        }
        System.out.println("Enter a whole number, please:");
      }
    }

    public static boolean isPalindrome(int x) {

      ArrayList <Integer> palindromeArray = new ArrayList <Integer> ();
      String countLen = Integer.toString(x);
      if (countLen.length() == 1) return true;

      while (x > 0) {
        // to get the "end" of the number, we take the reminder (of decimal)
        // of it by 10. Then we divide by 10 to set it up for the next one
        int remainderOf = x % 10;
        x = x / 10;

        // we add the "taken" number to put it
        // into an ArrayList for further analysis
        palindromeArray.add(remainderOf);
      }

      // Since we cannot modify an ArrayList during iteration, we make a copy of it
      ArrayList < Integer > duringBuild = new ArrayList < Integer > (palindromeArray);

      if (duringBuild.size() > 1) {
        for (Integer s: palindromeArray) {
          // For each number, we check if the first and last digit are not the same...
          if (duringBuild.get(duringBuild.size() - 1) != duringBuild.get(0)) return false;
          // if not, an instant false is given

          // if it IS the same, we get the new size
          // we then chop off the last and first from the ArrayList
          int newSize = duringBuild.size();
          duringBuild.remove(newSize - 1);
          duringBuild.remove(0);

          // if at any time we realize we have 1 or 0 integers left
          // we mark it true because it's obviously a single digit or none
          if (duringBuild.size() == 0 || duringBuild.size() == 1) return true;
        }
      }
      return false;
    }
  }