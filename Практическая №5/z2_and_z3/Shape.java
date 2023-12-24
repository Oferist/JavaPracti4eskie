package z2_and_z3;

//Абстрактный суперкласс Shape
abstract class Shape {
	protected String color; // Цвет фигуры
	protected boolean filled; // Заполнена ли фигура

	// Конструктор класса Shape
	public Shape(String color, boolean filled) {
		this.color = color;
		this.filled = filled;
	}

	// Геттеры и сеттеры для переменных экземпляра
	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public boolean isFilled() {
		return filled;
	}

	public void setFilled(boolean filled) {
		this.filled = filled;
	}

	// Абстрактные методы для вычисления площади и периметра фигуры
	public abstract double getArea();
	public abstract double getPerimeter();

	@Override
	public String toString() {
		return "Shape[color=" + color + ", filled=" + filled + "]";
	}
}
