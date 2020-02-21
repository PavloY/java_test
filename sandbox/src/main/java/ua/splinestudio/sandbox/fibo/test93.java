package ua.splinestudio.sandbox.fibo;

import java.math.BigInteger;
import java.util.Scanner;

public class test93 {
  public static void main(String[] args) {

    boolean isLength = false;
    boolean isRange = false;
    BigInteger previousNumbers = BigInteger.valueOf(0);
    int previousNumber = 0;
    BigInteger nextNumbers = BigInteger.valueOf(0);
    int nextNumber = 0;
    int lengh = 3;
    int lover = 100;
    int upper = 999;



        if (previousNumber >= lover && previousNumber <= upper) {
          System.out.print(previousNumber + ", ");;
        }
        if (previousNumber > upper) {
          isRange = true;
        }
        int sum = previousNumber + nextNumber;
        previousNumber = nextNumber;
        nextNumber = sum;
         System.out.print(previousNumber + ", ");
    }

  }

