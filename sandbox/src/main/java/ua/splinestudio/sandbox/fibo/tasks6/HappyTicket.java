package ua.splinestudio.sandbox.fibo.tasks6;

import java.util.HashMap;
import java.util.Map;

class HappyTicket {
    private int startTicket;
    private int finishTicket;

    HappyTicket(int startTicket, int finishTicket) {
        this.startTicket = startTicket;
        this.finishTicket = finishTicket;
    }

    public Map<String, Integer> getResult() {
        int countSimpleWay = 0;
        int countDifficultWay = 0;
        for (int i = startTicket; i <= this.finishTicket; i++) {
            int[] currentTicketArray = HandlingData.convertFromIntToArrayInt(i);
            if (this.checkHappyTicketSimpleWay(currentTicketArray)) {
                countSimpleWay++;
            }
            if (this.checkHappyTicketDifficultWay(currentTicketArray)) {
                countDifficultWay++;
            }
        }
        Map<String, Integer> result = new HashMap<>();
        result.put("simple way", countSimpleWay);
        result.put("difficult way", countDifficultWay);
        return result;
    }

    private boolean checkHappyTicketSimpleWay(int[] numArray) {
        int sumFirstThreeDigits = 0;
        int sumLastThreeDigits = 0;
        for (int i = 0; i < numArray.length; i++) {
            if (i < numArray.length / 2) {
                sumFirstThreeDigits += numArray[i];
            } else {
                sumLastThreeDigits += numArray[i];
            }
        }
        return sumFirstThreeDigits == sumLastThreeDigits;
    }

    private boolean checkHappyTicketDifficultWay(int[] numArray) {
        int sumOddDigits = 0;
        int sumEvenDigits = 0;
        for (int i = 0; i < numArray.length; i++) {
            if (i % 2 == 0) {
                sumEvenDigits += numArray[i];
            } else {
                sumOddDigits += numArray[i];
            }
        }
        return sumOddDigits == sumEvenDigits;
    }
}
