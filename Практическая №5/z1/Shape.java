package z1;

// Абстрактный родительский класс Shape
abstract class Shape {
    // Абстрактный метод для вычисления площади фигуры
    public abstract double calculateArea();
    
    // Общий метод, который может быть переопределен в дочерних классах
    public void display() {
        System.out.println("Это фигура.");
    }
}