package ua.splinestudio.sandbox.fibo.tasks6;

import java.util.Scanner;

class InputData {
    private static Scanner sc = new Scanner(System.in);

    public static String[] getTicketNumber() {
        String[] ticketNumbers = new String[2];
        System.out.println("Input started ticket number:");
        ticketNumbers[0] = sc.nextLine();
        System.out.println("Input finished ticket number:");
        ticketNumbers[1] = sc.nextLine();
        return ticketNumbers;
    }

    public static void closeScanner() {
        sc.close();
    }
}