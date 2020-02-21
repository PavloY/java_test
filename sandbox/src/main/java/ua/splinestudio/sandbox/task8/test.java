package ua.splinestudio.sandbox.task8;

import java.util.ArrayList;

public class test {
  public void main(String[] args) {




    show(15, 0);
  }

  private void show(int upper, int lower) {
    System.out.println(seriesFibonacci(lower, upper));
  }

  public static ArrayList<Integer> seriesFibonacci ( int lower, int upper){
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

  public static ArrayList<Integer> seriesLengthFibonacci(int length) {
    ArrayList<Integer> mainSeriesFibo = new ArrayList<Integer>();
    int i = 0;
    while(mainSeriesFibo.size() < length) {
      if( i == 0) {
        mainSeriesFibo.add(0);
      }else if(i == 1) {
        mainSeriesFibo.add(1);
      }else {
        mainSeriesFibo.add(mainSeriesFibo.get(i - 2) + (mainSeriesFibo.get(i -1)));
      }
      i++;
    }
    return mainSeriesFibo;
  }
  }



