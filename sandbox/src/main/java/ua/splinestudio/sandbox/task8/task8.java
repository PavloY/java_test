package ua.splinestudio.sandbox.task8;

import java.util.ArrayList;

public class task8 {

    public static void main(String[] args) {

      try {
        if(args.length == 0) {
          System.out.println("This program works in two modes:");
          System.out.println("1.If you want to get Fibonacci numbers with fixed length,"
                  + " You have to enter \n one integer variable which will be length of fibonacci line. ");
          System.out.println("2.If you want to get Fibonacci numbers from interval,"
                  + " You have to enter two integer variables,\n "
                  + "which are borders from this interval. ");
        }
        else if(args.length == 1) {
          int length = Integer.parseInt(args[0]);
          ArrayList<Integer> fiboLine = task8.getFiboLineFixedLenght(length);
          task8.showList(fiboLine);
        }
        else if(args.length == 2) {
          int minValue = Integer.parseInt(args[0]);
          int maxValue = Integer.parseInt(args[1]);
          ArrayList<Integer> fiboLine = task8.getFiboLineFromInterval(minValue, maxValue);
          task8.showList(fiboLine);
        }
        else {
          System.out.println("Inputted parameters are wrong");
        }
      }catch(NumberFormatException e) {
        System.out.println("Inputted parameters are wrong");
      }


    }

    public static ArrayList<Integer> getFiboLineFixedLenght(int length) {
      ArrayList<Integer> fiboLine = new ArrayList<Integer>();
      int i = 0;
      while(fiboLine.size() < length) {
        if( i == 0) {
          fiboLine.add(0);
        }else if(i == 1) {
          fiboLine.add(1);
        }else {
          fiboLine.add(fiboLine.get(i - 2) + (fiboLine.get(i -1)));
        }
        i++;
      }
      return fiboLine;
    }

    public static ArrayList<Integer> getFiboLineFromInterval(int minValue, int maxValue) {
      ArrayList<Integer> fiboLine = new ArrayList<Integer>();
      ArrayList<Integer> temporaryFiboLine = new ArrayList<Integer>();
      int i = 0;
      while(true) {
        if(i == 0) {
          temporaryFiboLine.add(0);
        }else if(i == 1) {
          temporaryFiboLine.add(1);
        }else {
          temporaryFiboLine.add(temporaryFiboLine.get(i - 2) +
                  temporaryFiboLine.get(i -1));
        }
        if(temporaryFiboLine.get(i) >= minValue &&
                temporaryFiboLine.get(i) <= maxValue) {
          fiboLine.add(temporaryFiboLine.get(i));
        }
        if(temporaryFiboLine.get(i) > maxValue) {
          break;
        }
        i++;
      }
      return fiboLine;
    }

    private static void showList(ArrayList<Integer> fiboLine) {
      for(int i = 0; i < fiboLine.size(); i++) {
        System.out.print(fiboLine.get(i) + " ");
      }
    }
  }


