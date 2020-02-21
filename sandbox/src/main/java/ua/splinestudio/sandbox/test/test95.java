package ua.splinestudio.sandbox.test;

public class test95 {
  public static void main(String[] args) {

    boolean q = false;
    int previousNumber = 0;
    int lengh = 1;
    int nextNumber = 1;
    int lover = 0;
    int upper = 900;
    createFibo(q, previousNumber, lengh, nextNumber, lover, upper);
    fiboRange(q, previousNumber, nextNumber, lover, upper);

  }
  private static void createFibo ( boolean q, int previousNumber, int lengh, int nextNumber, int lover, int upper ){
    fiboRange(q, previousNumber, nextNumber, lover, upper);
  }

  private static void fiboRange(boolean q, int previousNumber, int nextNumber, int lover, int upper) {
    do{
      int sum = previousNumber + nextNumber;
      previousNumber = nextNumber;
      nextNumber = sum;
    }while (!showRange(previousNumber, q, lover, upper));
  }

  private static boolean showRange ( int previousNumber, boolean q, int lover, int upper){
    if (previousNumber >= lover && previousNumber <= upper) {
      System.out.print(previousNumber + ", ");
    }
    if (previousNumber > upper) {
      q = true;
    }
    return q;
  }
}
