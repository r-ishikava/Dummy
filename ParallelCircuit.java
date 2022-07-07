public class ParallelCircuit extends CompositeCircuit {
    public ParallelCircuit(Circuit[] circuit) {
        super(circuit);
    }

    @Override
    public double getResistance() {
        double numerator = 0;
        double denominator = 0;
        double denAux;
        double newDenominator;

        for (Circuit circuit : getCircuits()) {
            if (denominator == 0) {
                denominator = circuit.getResistance();
                numerator = 1;

            } else {
                newDenominator = circuit.getResistance();
                denAux = denominator;
                denominator *= circuit.getResistance();
                numerator = denominator / denAux * numerator + denominator / newDenominator;
            }
        }

        return denominator / numerator;
    }
}
