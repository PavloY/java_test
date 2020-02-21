package ua.splinestudio.sandbox.task;


import java.util.Scanner;

class InputData {
  public static String[] getData(Scanner sc) {
    System.out.println("Please, enter data for triangle: <name>, <side length>, " +
            "<side length>, <side length>");
    String data = sc.nextLine().toLowerCase();
    data = data.replaceAll(" ", "");
    return data.split(",");
  }
}