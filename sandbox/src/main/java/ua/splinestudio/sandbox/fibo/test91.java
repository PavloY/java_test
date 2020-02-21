package ua.splinestudio.sandbox.fibo;

import java.util.ArrayList;
import java.util.Scanner;

public class test91 {

  public static void main(String[] args) {

        int maxNumber;
        int previousNumber = 0;
        int nextNumber = 1;
        int lower = 0;
        int upper = 12;
        int [] fibo;


        System.out.println("How may numbers you want in the sequence:");
        Scanner scanner = new Scanner(System.in);
        maxNumber = scanner.nextInt();
        scanner.close();
        System.out.print("Fibonacci Series of "+maxNumber+" numbers:");

        for (int i=1; i <= maxNumber; ++i){
          showLengh(previousNumber);
          int sum = previousNumber + nextNumber;
          previousNumber = nextNumber;
          nextNumber = sum;
        }


      }

  private static void show(int previousNumber) {
    int lower = 0;
    int upper = 50;
    if (previousNumber >= lower && previousNumber <= upper) {
    System.out.print(previousNumber + ", ");
    }
  }

  private static void showLengh (int previousNumber) {
    int lengh = 3;
    if (String.valueOf(Math.abs(previousNumber)).length() == lengh) {
      System.out.print(previousNumber + ", ");
    }

  }
}