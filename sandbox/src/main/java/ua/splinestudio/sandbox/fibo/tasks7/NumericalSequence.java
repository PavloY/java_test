package numerical_sequence;
/*
Вывести через запятую ряд длиной n, состоящий из натуральных чисел, квадрат которых не
меньше заданного m.
Входные параметры: длина и значение минимального квадрата
Выход: строка с рядом чисел
 */

import java.util.List;

public class NumericalSequence {
    private static String length;
    private static String minValue;

    public static void main(String[] args){
        Display.displayStartMessage();
        do{
            length = InputData.getLength();
            minValue = InputData.getMinValue();
        }while(!ValidateData.checkLength(length) || !ValidateData.checkMinValue(minValue));
        InputData.closeScanner();
        NumSequence sequence = new NumSequence(Integer.parseInt(length), Double.parseDouble(minValue));
        List<Integer> numSequence = sequence.getNumSequence();
        Display.displaySequence(numSequence);
    }
}


















