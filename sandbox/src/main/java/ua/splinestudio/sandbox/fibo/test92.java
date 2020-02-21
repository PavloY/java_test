package ua.splinestudio.sandbox.fibo;

import java.math.BigInteger;
import java.util.ArrayList;


public class test92 {

    public static void main(String[] args) {

          int count = 10;
          int previousNumber = 0;
          BigInteger previousNumbers = BigInteger.valueOf(0);
          int nextNumber = 1;
          BigInteger nextNumbers = BigInteger.valueOf(1);

          //BigInteger sums;// = BigInteger.valueOf(0);

          System.out.print("Fibonacci Series of "+count+" numbers:");

          for (int i = 1; i <= count; ++i)
          {
            System.out.print(previousNumber+" ");

            previousNumber = previousNumber + nextNumber;
            int sum = previousNumber;
            previousNumber = nextNumber;
            nextNumber = sum;


/*
        int sum = previousNumber + nextNumber;
        previousNumber = nextNumber;
        nextNumber = sum;
 */
      }

  }
}
