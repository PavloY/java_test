package numerical_sequence;

import java.util.List;

class Display{
    public static void displayStartMessage(){
        System.out.println("To use this program you have to input length of sequence and minimal value. " +
                "The program will show numerical sequence.\n The squaring each number of this sequence is more then " +
                "inputted minimal value.");
    }

    public static void displaySequence(List<Integer> numSequence){
        for(Integer temp: numSequence) {
            System.out.print(temp + " ");
        }
    }
}
