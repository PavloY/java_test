package ua.splinestudio.sandbox.fibo;

import java.math.BigInteger;

public class test96 {
  public static void main(String[] args) {

  boolean isLength = false;
  boolean isRange = false;

  BigInteger previousNumbers = new BigInteger("0");
  BigInteger lover = new BigInteger("100000000000");
  BigInteger upper = new BigInteger("10000000000000000");
  BigInteger nextNumbers = new BigInteger("1");
  BigInteger sums = new BigInteger("0");
  int length = 40;

    rangeFibonacci(lover, upper, previousNumbers, nextNumbers,  isRange , sums);
    System.out.println("\n");
    lengthFibonacci(length, previousNumbers, nextNumbers, isLength, sums);

  }
  public static void rangeFibonacci(BigInteger lover, BigInteger upper, BigInteger previousNumbers, BigInteger nextNumbers, boolean isRange, BigInteger sums) {
    do {
      if ((previousNumbers.compareTo(lover) == 1 || previousNumbers.compareTo(lover) == 0)
              && (previousNumbers.compareTo(upper) == -1 || previousNumbers.compareTo(upper) == 0)) {
        showFibonacci(previousNumbers);
      }
      if (previousNumbers.compareTo(upper) == 1) {
        isRange = true;
      }
      previousNumbers = previousNumbers.add(nextNumbers);
      sums = previousNumbers;
      previousNumbers = nextNumbers;
      nextNumbers = sums;

    } while (!isRange);
  }

  public static void lengthFibonacci(int length, BigInteger previousNumbers, BigInteger nextNumbers, boolean isLength, BigInteger sums) {
    do {
      if (previousNumbers.toString().length() == length) {
        showFibonacci(previousNumbers);
      }
      if (previousNumbers.toString().length() > length) {
        isLength = true;
      }
      previousNumbers = previousNumbers.add(nextNumbers);
      sums = previousNumbers;
      previousNumbers = nextNumbers;
      nextNumbers = sums;

    } while (!isLength);
  }

  public static void showFibonacci(BigInteger previousNumbers) {
    System.out.print(previousNumbers + ", ");
  }

}
