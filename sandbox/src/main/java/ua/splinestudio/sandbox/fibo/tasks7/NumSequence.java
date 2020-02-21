package numerical_sequence;

import java.util.ArrayList;
import java.util.List;

class NumSequence {
    private int length;
    private double minValue;

    NumSequence(int length, double minValue) {
        this.length = length;
        this.minValue = minValue;
    }

    public List<Integer> getNumSequence() {
        List<Integer> numericalSequence = new ArrayList<>();
        for (int i = 1; numericalSequence.size() < this.length; i++) {
            if (i * i > this.minValue) {
                numericalSequence.add(i);
            }
        }
        return numericalSequence;
    }
}
