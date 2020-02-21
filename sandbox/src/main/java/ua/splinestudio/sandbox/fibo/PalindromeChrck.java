package ua.splinestudio.sandbox.fibo;

public class PalindromeChrck {

    public boolean reversedNum(int input) {
      int n = input;
      int reversedNum = 0;

      // реверс числа
      while (n != 0) {
        reversedNum = reversedNum * 10 + n % 10;
        n = n / 10;
      }

      // проверка на палидромность
      if(input==reversedNum){
        return true;
      } else return false;
    }

}
