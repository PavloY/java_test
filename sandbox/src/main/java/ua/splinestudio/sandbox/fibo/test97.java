package ua.splinestudio.sandbox.fibo;

import java.math.BigInteger;

import java.math.*;

public class test97 {
  public static void main(String[] args) {

    BigInteger a = new BigInteger("190");
    BigInteger lover = BigInteger.valueOf(1);
    BigInteger upper = BigInteger.valueOf(100);

  //  convert(lover);

    //  scale();

    System.out.println(a.toString().length());
  //  System.out.println(a.unscaledValue());

    /*
    if ((a.compareTo(lover) == 1 || a.compareTo(lover) == 0) && (a.compareTo(upper) == -1 || a.compareTo(upper) == 0)) {
      System.out.println("в");
    }
    */
    if (a.toString().length() >= 1) {
      System.out.println("за");
    }
    //System.out.println(a.compareTo(lover));
  }

  private BigInteger convert(String lover) {
    BigInteger loverTemp = new BigDecimal(lover).toBigInteger();
    return loverTemp;
  }
  /*
 */
  }

