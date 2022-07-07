public class SerialCircuit extends CompositeCircuit {
    public SerialCircuit(Circuit[] circuits) {
        super(circuits);
    }

    @Override
    public double getResistance() {
        double resistance = 0;
        for (Circuit circuit : getCircuits()) {
            resistance += circuit.getResistance();
        }
        return resistance;
    }
}
