package z1;

public class Main {
    public static void main(String[] args) {
        Circle circle = new Circle(5);
        circle.display(); // Выводит "Это круг."
        System.out.println("Площадь круга: " + circle.calculateArea()); // Выводит площадь круга
        
        Rectangle rectangle = new Rectangle(4, 6);
        rectangle.display(); // Выводит "Это прямоугольник."
        System.out.println("Площадь прямоугольника: " + rectangle.calculateArea()); // Выводит площадь прямоугольника
    }
}
