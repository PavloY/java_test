package ua.splinestudio.sandbox.fibo.pali;

public class Input {
  private int testline;


  public int lineShow(){
    testline = testline + 10;
    return testline;
  }

  public void setTestline(int testline) {
    this.testline = testline;
  }
}
