package S07.model;

/**
 * @apiNote Класс описывающий комплексное число.
 * realPart - вещественная часть.
 * imaginaryPart - мнимая часть.
 */
public class ComplexValue {

    private double realPart; // Вещественная часть

    private double imaginaryPart; // Мнимая часть

    public ComplexValue(double realPart, double imaginaryPart) {
        this.realPart = realPart;
        this.imaginaryPart = imaginaryPart;
    }

    public double getRealPart() {
        return realPart;
    }

    public void setRealPart(double realPart) {
        this.realPart = realPart;
    }

    public double getImaginaryPart() {
        return imaginaryPart;
    }

    public void setImaginaryPart(double imaginaryPart) {
        this.imaginaryPart = imaginaryPart;
    }

    @Override
    public String toString() {
        if (imaginaryPart >= 0) {
            return realPart + " + " + imaginaryPart + "i";
        } else {
            return realPart + " - " + (-imaginaryPart) + "i";
        }

    }
}