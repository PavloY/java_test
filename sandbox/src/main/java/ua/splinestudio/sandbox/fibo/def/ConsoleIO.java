package ua.splinestudio.sandbox.fibo.def;

import java.util.Scanner;

public class ConsoleIO {

//  public class ConsoleIO {
    static Scanner scanner = new Scanner(System.in);

    public static String enterNumber() {
      return scanner.nextLine();
    }

    public static boolean isContinue() {
      String scan = scanner.nextLine();
      return (scan.equalsIgnoreCase("y")
              || scan.equalsIgnoreCase("yes"));
    }

    public static void closeScanner() {
      scanner.close();
    }

    public static void printToConsole(String message) {
      System.out.println(message);
    }
  }

