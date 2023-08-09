package S07.presenter;

import model.ComplexValue;
import model.Model;
import model.Value;

/**
 * @apiNote Класс Presenter реализует взаимодействие с моделью.
 */
public class Presenter {

    Model model;

    public Presenter() {
        model = new Model();
    }

    public Value summary(Double firstvalue, Double secondvalue) {
        return model.summary(firstvalue, secondvalue);
    }

    public Value multiply(Double firstvalue, Double secondValue) {
        return model.multiply(firstvalue, secondValue);
    }

    public Value division(Double firstvalue, Double secondValue) {

        return model.division(firstvalue, secondValue);
    }

    public Value subtraction(Double firstvalue, Double secondValue) {
        return model.subtraction(firstvalue, secondValue);
    }

    public Value exponentiation(Double firstvalue, Double secondValue) {
        return model.exponent(firstvalue, secondValue);
    }

    public ComplexValue summary(Double var1r, Double var1i, Double var2r, Double var2i) {
        return model.summary(var1r, var1i, var2r, var2i);
    }

    public ComplexValue multiply(Double var1r, Double var1i, Double var2r, Double var2e) {
        return model.multiply(var1r, var1i, var2r, var2e);
    }

    public ComplexValue division(Double var1r, Double var1i, Double var2r, Double var2e) {
        return model.division(var1r, var1i, var2r, var2e);
    }

    public ComplexValue subtraction(Double var1r, Double var1i, Double var2r, Double var2e) {
        return model.subtraction(var1r, var1i, var2r, var2e);
    }

}