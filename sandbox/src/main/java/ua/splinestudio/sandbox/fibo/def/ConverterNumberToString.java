package ua.splinestudio.sandbox.fibo.def;

public class ConverterNumberToString {

  /* Task 5
5.	Число в пропись
Нужно преобразовать целое число в прописной вариант: 12 – двенадцать.
Программа запускается через вызов главного класса с параметрами.
 */


//  public class ConverterNumberToString {
    public static String continueProgram = "Do you want to continue? (y/yes or n/no)";
    public static String startProgram = "Enter a number in range of " +
            "- 999 999 999 999 and 999 999 999 999";
    public static String informError = "Invalid input number.  Enter a number in range of " +
            "-999 999 999 999 and 999 999 999 999!";

    public static void main(String[] args) {

      do {
        ConsoleIO.printToConsole(startProgram);
        try {
          long input = Long.parseLong(ConsoleIO.enterNumber());
          PalindromeSequence palindrome = new PalindromeSequence(input);
        //  String numberInWords = palindrome.getPalindromes();
          ConsoleIO.printToConsole(palindrome.getPalindromes());
        } catch (NumberFormatException e) {
          ConsoleIO.printToConsole(informError);
        }
        ConsoleIO.printToConsole(continueProgram);
      } while (ConsoleIO.isContinue());
      ConsoleIO.closeScanner();
    }
  }

