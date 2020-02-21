package ua.splinestudio.sandbox.fibo;

import java.math.BigInteger;

public class test95 {
  public static void main(String[] args) {

    int count = 100;

    BigInteger previousNumbers = BigInteger.valueOf(0);
    BigInteger nextNumbers = BigInteger.valueOf(1);
    BigInteger sums = BigInteger.valueOf(0);

    for (int i = 1; i <= count; ++i) {
      System.out.print(previousNumbers + ", ");
      previousNumbers = previousNumbers.add(nextNumbers);
      sums = previousNumbers;
      previousNumbers = nextNumbers;
      nextNumbers = sums;

    }
  }
}
