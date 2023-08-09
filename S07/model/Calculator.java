package S07.model;

/**
 * @apiNote Базовый интерфейс для работы с калькулятором.
 * @param <T> - Параметр типа.
 */
public interface Calculator<T> {

    T summary(T firstvalue, T secondValue);

    T multiply(T firstvalue, T secondValue);

    T division(T firstvalue, T secondValue);

    T subtraction(T firstvalue, T secondValue);

    T exponentiation(T firstvalue, T secondValue);

}