package z1;

// Дочерний класс Rectangle (прямоугольник), наследуется от Shape
class Rectangle extends Shape {
    private double length; // Длина прямоугольника
    private double width; // Ширина прямоугольника
    
    // Конструктор класса Rectangle
    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }
    
    // Переопределение метода calculateArea для прямоугольника
    @Override
    public double calculateArea() {
        return length * width; // Формула площади прямоугольника
    }
    
    // Переопределение метода display для прямоугольника
    @Override
    public void display() {
        System.out.println("Это прямоугольник.");
    }
}