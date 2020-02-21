package ua.splinestudio.sandbox.fibo.tasks6;

/*
Есть 2 способа подсчёта счастливых билетов:
1. Простой — если на билете напечатано шестизначное число, и сумма первых трёх
цифр равна сумме последних трёх, то этот билет считается счастливым.
2. Сложный — если сумма чётных цифр билета равна сумме нечётных цифр билета, то
билет считается счастливым.
Определить программно какой вариант подсчёта счастливых билетов даст их большее
количество на заданном интервале.
Входные параметры: min и max номер билета
Выход: информация о победившем методе и количестве счастливых билетов для
каждого способа подсчёта.
 */

import java.util.Map;

public class Ticket {
    private static String[] data;

    public static void main(String[] args){
        Display.showProgramInfo();
        do{
            data = InputData.getTicketNumber();
        }while(!ValidateData.checkData(data));
        InputData.closeScanner();
        int[] modifiedData = HandlingData.modifiedData(data);
        HappyTicket happyTicket = new HappyTicket(modifiedData[0], modifiedData[1]);
        Map<String, Integer> result = happyTicket.getResult();
        System.out.println(result);
        Display.showResult(result);
    }
}