package S07.model;

/**
 * @apiNote Класс отвечающий за бизнес логику приложения.
 * Тут содержаться методы, отвечающие за каждый из классов, реализующих интерфейс
 * SimpleCalculator, ComplexCalculator и реализующие их для каждого из этих классов.
 */
public class Model {

    private SimpleCalculator calculator;

    private ComplexCalculator complexcalculator;

    public Model() {
        calculator = new SimpleCalculator();
        complexcalculator = new ComplexCalculator();
    }

    public Value summary(Double firstvalue, Double secondvalue) {
        return calculator.summary(new Value(firstvalue), new Value(secondvalue));
    }

    public Value subtraction(Double firstvalue, Double secondvalue) {
        return calculator.subtraction(new Value(firstvalue), new Value(secondvalue));
    }

    public Value multiply(Double firstvalue, Double secondvalue) {
        return calculator.multiply(new Value(firstvalue), new Value(secondvalue));
    }

    public Value division(Double firstvalue, Double secondvalue) {
        if (secondvalue != 0) {
            return calculator.division(new Value(firstvalue), new Value(secondvalue));
        } else throw new ArithmeticException("Деление на 0 недопустимо!");
    }

    public Value exponent(Double firstvalue, Double secondvalue) {
        return calculator.exponentiation(new Value(firstvalue), new Value(secondvalue));
    }

    public ComplexValue summary(Double var1r, Double var1i, Double var2r, Double var2i) {
        return complexcalculator.summary(new ComplexValue(var1r, var1i), new ComplexValue(var2r, var2i));
    }

    public ComplexValue subtraction(Double var1r, Double var1i, Double var2r, Double var2i) {
        return complexcalculator.subtraction(new ComplexValue(var1r, var1i), new ComplexValue(var2r, var2i));
    }

    public ComplexValue multiply(Double var1r, Double var1i, Double var2r, Double var2i) {
        return complexcalculator.multiply(new ComplexValue(var1r, var1i), new ComplexValue(var2r, var2i));
    }

    public ComplexValue division(Double var1r, Double var1i, Double var2r, Double var2i) {
        return complexcalculator.division(new ComplexValue(var1r, var1i), new ComplexValue(var2r, var2i));
    }

}