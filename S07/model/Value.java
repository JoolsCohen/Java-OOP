package S07.model;

/**
 * @apiNote - Класс для хранения значений типа Value
 */
public class Value {

    private double value;

    public Value(double value) {
        this.value = value;
    }

    public double getValue() {
        return value;
    }

    public void setValue(double value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }
}