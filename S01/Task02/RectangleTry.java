package Task02;
public class RectangleTry {
    public static void main(String[] args) {
        Rectangle rectangle_1 = new Rectangle();
        System.out.println("Ширина первого прямоугольника равна: " + rectangle_1.getWidth());
        System.out.println("Высота первого прямоугольника равна: " + rectangle_1.getHeight());
        System.out.println("=".repeat(40));
        Rectangle rectangle_2 = new Rectangle(5,15);
        rectangle_1.calculateArea();
        rectangle_2.calculateArea();
        System.out.println("=".repeat(40));
        rectangle_1.calculatePerimeter();
        rectangle_2.calculatePerimeter();
    }
}