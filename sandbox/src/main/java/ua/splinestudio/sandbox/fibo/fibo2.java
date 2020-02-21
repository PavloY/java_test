package ua.splinestudio.sandbox.fibo;

public class fibo2 {

  public static void main(String[] args) {

    int[] arr = {0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, 233, 377, 610, 987, 1597, 2584, 4181, 6765,
            10946, 17711, 28657, 46368, 75025, 121393, 196418, 317811, 514229, 832040, 1346269, 2178309,
            3524578, 5702887, 9227465, 14930352, 24157817, 39088169, 63245986, 102334155, 165580141,
            267914296, 433494437, 701408733};
    int lenth =1;

    if (lenth == 1) {
      int x = 0;
      int k = 7;
      test(arr, x, k);
    }

    if (lenth == 2) {
      int x = 7;
      int k = 12;
      test(arr, x, k);
    }
    if (lenth == 3) {
      int x = 12;
      int k = 17;
      test(arr, x, k);
    }
    if (lenth == 4) {
      int x = 17;
      int k = 21;
      test(arr, x, k);
    }
    if (lenth == 5) {
      int x = 21;
      int k = 26;
      test(arr, x, k);
    }
    if (lenth == 6) {
      int x = 26;
      int k = 31;
      test(arr, x, k);
    }
    if (lenth == 7) {
      int x = 31;
      int k = 36;
      test(arr, x, k);
    }
    if (lenth == 8) {
      int x = 36;
      int k = 40;
      test(arr, x, k);
    }
    if (lenth == 9) {
      int x = 40;
      int k = 45;
      test(arr, x, k);
    }
  }

  private static void test(int[] arr, int x, int k) {
    for (int i=0; x < k; x++)
      System.out.print(arr[x] + ", ");
  }
}

