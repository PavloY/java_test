package ua.splinestudio.sandbox.fibo;

public class PalindromeRun {


    public static void main(String[] args) {
      System.out.println("Введіть значення для перевірки на наявність палідромних чисел");
      System.out.println("Щоб завершити ввід даних - введіть 0");
      int input = 1;
      do {
        Palindrome numberN = new Palindrome();
        input = numberN.readInt();
        PalindromeChrck result = new PalindromeChrck();
        if(input==0) {
          System.out.println("Дякуємо, що  вибрали наш продукт :)");
          break;
        } System.out.println("Паліндром " + result.reversedNum(input));
      }
      while (input!=0);
    }

}
