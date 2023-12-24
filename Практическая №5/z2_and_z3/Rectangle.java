package z2_and_z3;

//Подкласс Rectangle (прямоугольник) расширяет класс Shape
class Rectangle extends Shape {
	protected double width; // Ширина прямоугольника
	protected double length; // Длина прямоугольника

	// Конструктор класса Rectangle
	public Rectangle(double width, double length, String color, boolean filled) {
		super(color, filled);
		this.width = width;
		this.length = length;
	}
	
	public double getWidth() {
		return width;
	}
	
	public void setWidth(double width) {
		this.width = width;
	}
	
	public double getLength() {
		return length;
	}
	
	public void setLength(double length) {
		this.length = length;
	}

	// Переопределение методов для вычисления площади и периметра прямоугольника
	@Override
	public double getArea() {
		return width * length;
	}

	@Override
	public double getPerimeter() {
		return 2 * (width + length);
	}

	@Override
	public String toString() {
		return "Rectangle[" + super.toString() + ", width=" + width + ", length=" + length + "]";
	}
}