package ua.splinestudio.sandbox.fibo;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class test9 {
  public static void main(String[] args) {


    System.out.println(seriesRangeFibonacci(0,11));

  }

  public static ArrayList<Integer> seriesRangeFibonacci(int lower, int upper) {
    ArrayList<Integer> mainSeriesFibo = new ArrayList<Integer>();
    ArrayList<Integer> partFibo = new ArrayList<Integer>();
    int i = 0;
    while (true) {
      if (i == 0) {
        partFibo.add(0);
      } else if (i == 1) {
        partFibo.add(1);
      } else {
        partFibo.add(partFibo.get(i - 2) + partFibo.get(i - 1));
      }
      if (partFibo.get(i) >= lower && partFibo.get(i) <= upper) {
        mainSeriesFibo.add(partFibo.get(i));
      }
      if (partFibo.get(i) > upper) {
        break;
      }
      i++;
    }
    return mainSeriesFibo;
  }
}