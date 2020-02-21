package ua.splinestudio.sandbox.fibo.palindromes;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Set;

public class Validator {
  public Validator(String inputValidate) {
    this.inputValidate = inputValidate;
  }

  public Validator(Set<String> setValidate) {
    this.setValidate = setValidate;
  }

  ConsoleInput scan = new ConsoleInput();
  ConsoleOutPut print = new ConsoleOutPut();

  private String inputValidate;
  private Set<String> setValidate;

  public String validateInput() {
    do {
      scan.getInput();
      try {
        BigInteger tempValidate = new BigDecimal(scan.getInput()).toBigInteger();
        return inputValidate;
      } catch (NumberFormatException ex) {
        print.showResult("Incorrect input: You should enter only integers, please try again!\n");
      }
    } while (true);
  }

  public Set<String> validateSet () {
    if (setValidate.size() < 1) {
      setValidate.add("0");
    } else {
      return setValidate;
    }
    return setValidate;
  }

  public Set<String> getSetValidate() {
    if (setValidate == null) {
      setValidate = validateSet() ;
    }
    return setValidate;
  }

  public String getInputValidate() {
    if (inputValidate == null) {
      inputValidate = validateInput();
    }
    return inputValidate;
  }
}




