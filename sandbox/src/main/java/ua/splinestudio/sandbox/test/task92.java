package ua.splinestudio.sandbox.test;

import java.util.Scanner;

public class task92 {
  public static void main(String[] args) {

/*
    String line = "123321";
    int lineInt;

    lineInt = Integer.parseInt(line);
    String s = line.toString();
  */
    consoleInput();


 //   Integer.parseInt(String.valueOf(range);
  }

  private static void consoleInput() {
    do {
      String line;
      int lineInt;
      Scanner sc = new Scanner(System.in);
      System.out.println("enter int:");
      line = sc.nextLine();
      try {
        lineInt = Integer.parseInt(line);
        if (lineInt > 10 ) {
          break;
        } else {
          System.out.println("0");
        }
      } catch (NumberFormatException ex) {
        System.out.println("Incorrect input!");
      }
    } while (true);
  }
}

