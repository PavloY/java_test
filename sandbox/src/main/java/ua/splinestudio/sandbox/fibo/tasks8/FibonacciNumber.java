package fibonacci_number;

import java.util.List;

public class FibonacciNumber {
	private static String mode;
	private static String length;
	private static String[] interval;
	private static List<Integer> fiboSequence;

	public static void main(String[] args){
		Display.showProgramInformation();
		do{
			mode = InputData.getMode();
		}while(!ValidateData.checkMode(mode));
		if(mode.equals("1")){
			do {
				length = InputData.getLength();
			}while(!ValidateData.checkLength(length));
			FibonacciSequence fibo = new FibonacciSequence(Integer.parseInt(length));
			fiboSequence = fibo.getFiboLineFixedLength();

		}else{
			do {
				interval = InputData.getInterval();
			}while(!ValidateData.checkInterval(interval));
			FibonacciSequence fibo = new FibonacciSequence(Double.parseDouble(interval[0]),
					Double.parseDouble(interval[1]));
			fiboSequence = fibo.getFiboLineFromInterval();
		}
		InputData.closeScanner();
		Display.showFibonacciSequence(fiboSequence);
	}
}



