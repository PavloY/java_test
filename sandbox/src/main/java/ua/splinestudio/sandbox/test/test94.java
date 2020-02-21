package ua.splinestudio.sandbox.test;

public class test94 {

  public static void main(String[] args) {

    boolean isLength = false;
    boolean isRange = false;
    int previousNumber = 0;
    int nextNumber = 1;

    int lengh = 3;
    int lover = 100;
    int upper = 999;

    //
    lenghFibonacci(isLength, previousNumber, nextNumber, lengh);
    rangeFibonacci(isRange, previousNumber, nextNumber, lover, upper);

  }

  private static void rangeFibonacci(boolean isRange, int previousNumber, int nextNumber, int lover, int upper) {
    do {
      if (previousNumber >= lover && previousNumber <= upper) {
        showFibonacci(previousNumber);
      }
      if (previousNumber > upper) {
        isRange = true;
      }
      int sum = previousNumber + nextNumber;
      previousNumber = nextNumber;
      nextNumber = sum;
    } while (!isRange);
  }


  private static void lenghFibonacci(boolean isLength, int previousNumber, int nextNumber, int lengh) {
    do {
      if (String.valueOf(previousNumber).length() == lengh) {
        showFibonacci(previousNumber);
      }
      if (String.valueOf(previousNumber).length() > lengh) {
        isLength = true;
      }
      int sum = previousNumber + nextNumber;
      previousNumber = nextNumber;
      nextNumber = sum;
    } while (!isLength);
  }

  private static void showFibonacci(int previousNumber) {
    System.out.print(previousNumber + ", ");
  }

}






