package ua.splinestudio.sandbox.fibo.def;

import java.util.HashMap;
import java.util.Map;
/* PalindromeSequence у которого будет

* private String input
 и приватное поле
* private private String setPalindrome;

(т.е. у любых обьектов класса сиквенс будет два таких поля)
создавать PalindromeSequence конструктор он будет принимать

*   public PalindromeSequence(String input) {
*    this.input = input;
*  }

и будет 1 метод который будет называться getPalindromes он будет проверять
он будет проверять если наш setPalindrome не пустой, то мы запускаем дополнительный
метод findPalindromes, а getPalindromes будет return setPalindrome

* public String getPalindromes() {
*    if (setPalindrome == null) {
*      setPalindrome = findPalindromes(input);
*    }
*    return setPalindrome;

В Main мы создаем PalindromeSequence palindrome = new PalindromeCreator(); и передаем в него input от Scanner

* String input = Long.parseLong(ConsoleIO.enterNumber());
* PalindromeSequence numberToString = new PalindromeSequence(input);

ниже просто вызвать palindrome.getPalindromes();
Но для каждого инпута (строки) будет отдельный обьект PalindromeSequence */

public class PalindromeSequence {
  public PalindromeSequence(long input) {
    this.input = input;
  }

  public String getPalindromes() {
    if (setPalindrome == null) {
      setPalindrome = findPalindromes(input);
    }
    return setPalindrome;
  }

    private long input;
    private String setPalindrome;

    //Constants for common use
    private static final long TEN = 10;
    private static final long TWENTY = 20;
    private static final long ONE_HUNDRED = 100;
    private static final long ONE_THOUSAND = 1_000;
    private static final long ONE_MILLION = 1_000_000;
    private static final long ONE_BILLION = 1_000_000_000;
    private static final long ONE_TRILLION = 1_000_000_000_000L;

    //Maps of unique numbers
    private static final Map<Long, String> UNITS = new HashMap<>();
    private static final Map<Long, String> TENS = new HashMap<>();
    private static final Map<Long, String> HUNDREDS = new HashMap<>();

    static {
      UNITS.put(0L, "ноль");
      UNITS.put(1L, "один");
      UNITS.put(2L, "два");
      UNITS.put(3L, "три");
      UNITS.put(4L, "четыре");
      UNITS.put(5L, "пять");
      UNITS.put(6L, "шесть");
      UNITS.put(7L, "семь");
      UNITS.put(8L, "восемь");
      UNITS.put(9L, "девять");
      UNITS.put(10L, "десять");
      UNITS.put(11L, "одиннадцать");
      UNITS.put(12L, "двенадцать");
      UNITS.put(13L, "тринадцать");
      UNITS.put(14L, "четырнадцать");
      UNITS.put(15L, "пятнадцать");
      UNITS.put(16L, "шестнадцать");
      UNITS.put(17L, "семнадцать");
      UNITS.put(18L, "восемнадцать");
      UNITS.put(19L, "девятнадцать");
      TENS.put(2L, "двадцать");
      TENS.put(3L, "тридцать");
      TENS.put(4L, "сорок");
      TENS.put(5L, "пятьдесят");
      TENS.put(6L, "шестьдесят");
      TENS.put(7L, "семьдесят");
      TENS.put(8L, "восемьдесят");
      TENS.put(9L, "девяносто");
      HUNDREDS.put(1L, "сто");
      HUNDREDS.put(2L, "двести");
      HUNDREDS.put(3L, "триста");
      HUNDREDS.put(4L, "четыреста");
      HUNDREDS.put(5L, "пятьсот");
      HUNDREDS.put(6L, "шестьсот");
      HUNDREDS.put(7L, "семьсот");
      HUNDREDS.put(8L, "восемьсот");
      HUNDREDS.put(9L, "девятьсот");
    }



    private String findPalindromes(long number) {
      if (number < 0) {
        setPalindrome = "минус " + findPalindromes(Math.abs(number));
      } else if (number < TWENTY) {
        setPalindrome = UNITS.get(number);
      } else if (number < ONE_HUNDRED) {
        setPalindrome = (TENS.get(number / TEN)
                + (number % TEN > 0 ? " "
                + findPalindromes(number % TEN) : ""));
      } else if (number < ONE_THOUSAND) {
        setPalindrome = (HUNDREDS.get(number / ONE_HUNDRED)
                + (number % ONE_HUNDRED > 0 ? " "
                + findPalindromes(number % ONE_HUNDRED) : ""));
      } else if (number < ONE_MILLION) {
        setPalindrome = getEndThousand(findPalindromes((number / ONE_THOUSAND)))
                + (number % ONE_THOUSAND > 0 ? " "
                + findPalindromes(number % ONE_THOUSAND) : "");
      } else if (number < ONE_BILLION) {
        setPalindrome = getEndMillion(findPalindromes((number / ONE_MILLION)))
                + " "
                + getEndThousand(findPalindromes(((number % ONE_MILLION) / ONE_THOUSAND)))
                + (number % ONE_THOUSAND > 0 ? " "
                + findPalindromes(number % ONE_THOUSAND) : "");
      } else if (number < ONE_TRILLION) {
        setPalindrome = getEndBillion(findPalindromes((number / ONE_BILLION)))
                + " "
                + getEndMillion(findPalindromes((number % ONE_BILLION) / ONE_MILLION))
                + " "
                + getEndThousand(findPalindromes(((number % ONE_BILLION) % ONE_MILLION) / ONE_THOUSAND))
                + (number % ONE_THOUSAND > 0 ? " "
                + findPalindromes(number % ONE_THOUSAND) : "");
      } else {
        return "This number is not supported";
      }
      return setPalindrome.replaceAll(" {2,}", " "); // to avoid double whitespaces
    }

    // correct ending for thousands
    private String getEndThousand(String str) {
      if (str.equals("ноль")) {
        return "";
      } else if (str.endsWith("один")) {
        return str.replace("один", "одна тысяча");
      } else if (str.endsWith("два")) {
        if (str.endsWith("двадцать два")) {
          return str.replace("двадцать два", "двадцать две тысячи");
        } else {
          return str.replace("два", "две тысячи");
        }
      } else if (str.endsWith("три") || str.endsWith("четыре")) {
        return str + " тысячи";
      } else {
        return str + " тысяч";
      }
    }

    // correct ending for millions
    private String getEndMillion(String str) {
      if (str.equals("ноль")) {
        return "";
      } else if (str.endsWith("один")) {
        return str + " миллион";
      } else if (str.endsWith("два") || str.endsWith("три") || str.endsWith("четыре")) {
        return str + " миллиона";
      } else {
        return str + " миллионов";
      }
    }

    // correct ending for billions
    private String getEndBillion(String str) {
      if (str.equals("ноль")) {
        return "";
      } else if (str.endsWith("один")) {
        return str + " миллиард";
      } else if (str.endsWith("два") || str.endsWith("три") || str.endsWith("четыре")) {
        return str + " миллиарда";
      } else {
        return str + " миллиардов";
      }
    }
  }

