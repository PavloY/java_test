package ua.splinestudio.sandbox.test;

public class task93 {

  public static void main(String[] args) {

    boolean q = false;
    int previousNumber = 0;

    do {
      previousNumber += 1;
      if (previousNumber == 10) {
        System.out.print(previousNumber + ", ");
      }
      if (previousNumber > 10) {
        q = true;
      }
    } while (!q);

  }
}


