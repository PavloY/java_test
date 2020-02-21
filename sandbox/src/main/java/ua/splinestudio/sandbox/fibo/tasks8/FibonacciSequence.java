package fibonacci_number;

import java.util.ArrayList;
import java.util.List;

class FibonacciSequence{
    private int length;
    private double lowLimit;
    private double highLimit;
    private List<Integer> fiboSequence;

    FibonacciSequence(int length){
        this.length = length;
    }

    FibonacciSequence(double lowLimit, double highLimit){
        this.lowLimit = lowLimit;
        this.highLimit = highLimit;
    }

    public List<Integer> getFiboLineFixedLength() {
        List<Integer> fiboLine = new ArrayList<>();
        for(int i = 0; fiboLine.size() < this.length; i++) {
            if( i == 0) {
                fiboLine.add(0);
            }else if(i == 1) {
                fiboLine.add(1);
            }else {
                fiboLine.add(fiboLine.get(i - 2) + (fiboLine.get(i -1)));
            }
        }
        return fiboLine;
    }

    public List<Integer> getFiboLineFromInterval() {
        List<Integer> fiboLine = new ArrayList<>();
        List<Integer> temporaryFiboLine = new ArrayList<>();
        for(int i = 0; i >= 0; i++) {
            if(i == 0) {
                temporaryFiboLine.add(0);
            }else if(i == 1) {
                temporaryFiboLine.add(1);
            }else {
                temporaryFiboLine.add(temporaryFiboLine.get(i - 2) +
                        temporaryFiboLine.get(i -1));
            }
            if(temporaryFiboLine.get(i) >= this.lowLimit &&
                    temporaryFiboLine.get(i) <= this.highLimit) {
                fiboLine.add(temporaryFiboLine.get(i));
            }
            if(temporaryFiboLine.get(i) > this.highLimit) {
                break;
            }
        }
        return fiboLine;
    }
}
