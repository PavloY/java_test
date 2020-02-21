package ua.splinestudio.sandbox.fibo.palindromes;

import java.util.Set;

public class ConsoleOutPut {

  public void showResult(String text) {
    System.out.println(text);
  }

  public void showResult(Set<String> set) {
  //  if (set.size() < 1) {
    //  showResult("[0]");
   // } else {
      System.out.println(set);
    //}
  }
}