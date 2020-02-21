package fibonacci_number;

import java.util.Scanner;

class InputData{
    private static Scanner sc = new Scanner(System.in);

    public static String getMode(){
        System.out.println("Choose mode(enter only '1' or '2'):");
        return sc.nextLine();
    }

    public static String getLength(){
        System.out.println("Enter length of Fibonacci sequence(Must be integer and must be above 0):");
        return sc.nextLine();
    }

    public static String[] getInterval(){
        String[] interval = new String[2];
        System.out.println("Enter a low interval limit(Can be integer or number with floating point):");
        interval[0] = sc.nextLine();
        System.out.println("Enter a high interval limit(Can be integer or number with floating point and must be " +
                "above 0):");
        interval[1] = sc.nextLine();
        return interval;
    }

    public static void closeScanner(){sc.close();}

}
