package S07.Viewer;

import presenter.Presenter;

import java.util.Scanner;

/**
 * @apiNote Класс ConsoleView отвечающий за вывод в консоль.
 */
public class ConsoleView implements UserGUI {

    private Menu menu;

    private Scanner in;


    private Presenter presenter;

    public ConsoleView() {
        menu = new Menu();
        presenter = new Presenter();
        in = new Scanner(System.in);
    }


    @Override
    public void selectionButton() {
        while (true) {
            System.out.println("""
                    1. Вещественные
                    2. Комплексные\s""");
            System.out.print("Выбирете с какими числами желаете работать: ");
            switch (in.nextLine()) {
                case "1":
                    simpleCalculatorMenu();
                    break;
                case "2":
                    complexCalculatorMenu();
                    break;
            }
            return;
        }
    }

    public void simpleCalculatorMenu() {

        while (true) {
            System.out.println(menu.getMenu());
            System.out.print("Выбирете операцию: ");
            switch (in.nextLine()) {
                case "+":
                    System.out.println("Результат: " + presenter.summary(inputFirstValue(), inputSecondValue()));
                    break;
                case "-":
                    System.out.println("Результат: " + presenter.subtraction(inputFirstValue(), inputSecondValue()));
                    break;
                case "*":
                    System.out.println("Результат: " + presenter.multiply(inputFirstValue(), inputSecondValue()));
                    break;
                case "/":
                    System.out.println("Результат: " + presenter.division(inputFirstValue(), inputSecondValue()));
                    break;
                case "**":
                    System.out.println("Результат: " + presenter.exponentiation(inputFirstValue(), inputSecondValue()));
                    break;
                default:
                    System.out.println("Неверно введена операция! Повторите ввод!");
            }
            return;
        }
    }

    @Override
    public void complexCalculatorMenu() {
        while (true) {
            System.out.println(menu.getMenu());
            System.out.print("Выбирете операцию: ");
            switch (in.nextLine()) {
                case "+":
                    System.out.println("Результат: " + presenter.summary(inputRealPartFirstValue(),
                            inputImaginaryPartFirstValue(),
                            inputRealPartSecondValue(),
                            inputImaginaryPartSecondValue()));
                    break;
                case "-":
                    System.out.println("Результат: " + presenter.subtraction(inputRealPartFirstValue(),
                            inputImaginaryPartFirstValue(),
                            inputRealPartSecondValue(),
                            inputImaginaryPartSecondValue()));
                    break;
                case "*":
                    System.out.println("Результат: " + presenter.multiply(inputRealPartFirstValue(),
                            inputImaginaryPartFirstValue(),
                            inputRealPartSecondValue(),
                            inputImaginaryPartSecondValue()));
                    break;
                case "/":
                    System.out.println("Результат: " + presenter.division(inputRealPartFirstValue(),
                            inputImaginaryPartFirstValue(),
                            inputRealPartSecondValue(),
                            inputImaginaryPartSecondValue()));
                    break;
                case "**":
                    System.out.println("Возведение в степень не предусмотрено для комплексных чисел!");
                    break;
                default:
                    System.out.println("Неверно введена операция! Повторите ввод!");
            }
            return;
        }


    }

    @Override
    public Double inputFirstValue() {
        System.out.print("Введите первое число: ");
        return in.nextDouble();
    }

    @Override
    public Double inputSecondValue() {
        System.out.print("Введите второе число: ");
        return in.nextDouble();
    }


    @Override
    public Double inputRealPartFirstValue() {
        System.out.println("Введите вещественную часть первого числа: ");
        return in.nextDouble();
    }

    @Override
    public Double inputImaginaryPartFirstValue() {
        System.out.println("Введите мнимую часть первого числа: ");
        return in.nextDouble();
    }

    @Override
    public Double inputRealPartSecondValue() {
        System.out.println("Введите вещественную часть второго числа: ");
        return in.nextDouble();
    }

    @Override
    public Double inputImaginaryPartSecondValue() {
        System.out.println("Введите мнимую часть второго числа: ");
        return in.nextDouble();
    }
}