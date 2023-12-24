package pr4;

public class Circle {
    private double radius;

    // Конструктор для создания объекта окружности с указанным радиусом
    public Circle(double radius) {
        this.radius = radius;
    }

    // Метод для получения радиуса окружности
    public double getRadius() {
        return radius;
    }

    // Метод для изменения радиуса окружности
    public void setRadius(double radius) {
        this.radius = radius;
    }

    // Метод для вычисления площади окружности
    public double calculateArea() {
    	double area = Math.PI * radius * radius;
        return Math.round(area * 100.0) / 100.0;
    }

    // Метод для вычисления длины окружности
    public double calculateCircumference() {
    	double circumference = 2 * Math.PI * radius;
        return Math.round(circumference * 100.0) / 100.0;
    }
}
