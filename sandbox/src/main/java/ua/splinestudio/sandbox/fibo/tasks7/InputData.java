package numerical_sequence;
import java.util.Scanner;

class InputData {
    private static Scanner sc = new Scanner(System.in);

    public static String getLength(){
        System.out.println("Input length(Length must be integer and must be above 0):");
        return sc.nextLine();
    }

    public static String getMinValue(){
        System.out.println("Input minimal value(Can be integer or number with floating point and must be above 0):");
        return sc.nextLine();
    }

    public static void closeScanner(){
        sc.close();
    }
}
