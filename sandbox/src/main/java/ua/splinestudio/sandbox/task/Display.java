package ua.splinestudio.sandbox.task;


import java.util.TreeSet;

class Display{
  static void displaySetTriangle(TreeSet<Triangle> triangleSet){
    System.out.println("=================Triangle list:================= ");
    int i = 1;
    for (Triangle temp:triangleSet){
      System.out.printf(i + ". [Triangle " + temp.getName() + "]: %.2f cm\n", temp.getArea());
      i++;
    }
  }
}