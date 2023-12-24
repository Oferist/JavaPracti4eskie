package z1;

// Дочерний класс Circle (круг), наследуется от Shape
class Circle extends Shape {
    private double radius; // Радиус круга
    
    // Конструктор класса Circle
    public Circle(double radius) {
        this.radius = radius;
    }
    
    // Переопределение метода calculateArea для круга
    @Override
    public double calculateArea() {
        return Math.PI * radius * radius; // Формула площади круга
    }
    
    // Переопределение метода display для круга
    @Override
    public void display() {
        System.out.println("Это круг.");
    }
}
