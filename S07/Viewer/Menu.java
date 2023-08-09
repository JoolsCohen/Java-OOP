package S07.Viewer;

import java.util.Scanner;

/**
 * @apiNote - Класс меню, представляющий собой вывод информации о действии с пользователем.
 */
public class Menu {

    private String menu;

    public Menu() {
        menu = """
                1. "+" - сложить два числа;
                2. "-" - вычесть два числа;
                3. "*" - умножить два числа;
                4. "/" - разделить два числа;
                5  "**" - возвести в степень два числа.
                """;

    }

    public String getMenu() {
        return menu;
    }


}