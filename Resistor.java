/**
 * Class for singular resistors.
 */
public class Resistor extends Circuit {
    private final double resistance;

    /**
     * Resistor class constructor.
     *
     * @param resistance resistance value. Must be a positive number
     */
    public Resistor(double resistance) {
        if (resistance < 0) {
            throw new IllegalArgumentException("Resistance must be a postive value");
        }
        this.resistance = resistance;
    }

    @Override
    public double getResistance() {
        return resistance;
    }
}
