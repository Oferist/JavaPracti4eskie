package z2_and_z3;

//Подкласс Circle (круг) расширяет класс Shape
class Circle extends Shape {
	protected double radius; // Радиус круга

	// Конструктор класса Circle
	public Circle(double radius, String color, boolean filled) {
		super(color, filled);
		this.radius = radius;
	}
	
	public double getRadius() {
		return radius;
	}
	
	public void setRadius(double radius) {
		this.radius = radius;
	}

	// Переопределение методов для вычисления площади и периметра круга
	@Override
	public double getArea() {
		return Math.PI * radius * radius;
	}

	@Override
	public double getPerimeter() {
		return 2 * Math.PI * radius;
	}

	@Override
	public String toString() {
		return "Circle[" + super.toString() + ", radius=" + radius + "]";
	}
}
