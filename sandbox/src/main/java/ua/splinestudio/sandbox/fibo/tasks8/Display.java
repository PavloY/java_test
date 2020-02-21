package fibonacci_number;

import java.util.List;

class Display{
    public static void showProgramInformation(){
        System.out.println("This program works in two modes:");
        System.out.println("1.If you want to get Fibonacci numbers with fixed length,"
                + " You have to enter \n one integer variable which will be length of fibonacci line. ");
        System.out.println("2.If you want to get Fibonacci numbers from interval,"
                + " You have to enter two integer variables,\n "
                + "which are borders from this interval. ");
    }

    public static void showFibonacciSequence(List<Integer> fiboLine) {
        for(int i = 0; i < fiboLine.size(); i++) {
            System.out.print(fiboLine.get(i) + " ");
        }
    }
}
