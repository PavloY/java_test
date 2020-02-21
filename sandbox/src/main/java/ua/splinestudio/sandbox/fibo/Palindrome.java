package ua.splinestudio.sandbox.fibo;

import java.util.Scanner;

public class Palindrome {


    private Scanner scan = new Scanner(System.in);
    public int readInt() {
      System.out.print(">> ");
      // проверка на корректность числа
      while (!scan.hasNextInt()) {
        scan.next();
        System.out.println("Введіть коректне значення");
        System.out.print(">> ");
      }
      return scan.nextInt();
    }
  }

