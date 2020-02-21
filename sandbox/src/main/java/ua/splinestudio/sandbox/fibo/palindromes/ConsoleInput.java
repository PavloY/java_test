package ua.splinestudio.sandbox.fibo.palindromes;

import java.util.Scanner;

public class ConsoleInput {

  public ConsoleInput() {
  }

  ConsoleOutPut print = new ConsoleOutPut();

  private String input;

  public String scanInput() {
    Scanner sc = new Scanner(System.in);
    print.showResult("Enter the number to calculate the palindrome (only integers):");
    input = sc.nextLine();
    return input;
  }

  public String getInput() {
    if (input == null) {
      input = scanInput();
    }
    return input;
  }
}

