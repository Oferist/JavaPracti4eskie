package z2_and_z3;

//Подкласс Square (квадрат) расширяет класс Rectangle
class Square extends Rectangle {
	// Конструктор класса Square
	public Square(double side, String color, boolean filled) {
		super(side, side, color, filled); // Квадрат имеет одинаковую ширину и длину
	}

	public Square(double side) {
        super(side, side, "RED", false); // Квадрат имеет одинаковую ширину и длину
    }
	
	// Метод для получения длины стороны квадрата
	public double getSide() {
		return getWidth(); // Ширина и длина квадрата одинаковы, поэтому можно использовать getWidth()
	}

	// Метод для установки длины стороны квадрата
	 public void setSide(double side) {
	     setWidth(side);
	     setLength(side);
	 }

	 // Переопределение метода setWidth() для квадрата
	 @Override
	 public void setWidth(double side) {
	     super.setWidth(side); // Устанавливаем ширину с использованием метода родительского класса Rectangle
	     super.setLength(side); // Устанавливаем длину с использованием метода родительского класса Rectangle
	 }
	
	 // Переопределение метода setLength() для квадрата
	 @Override
	 public void setLength(double side) {
	     super.setLength(side); // Устанавливаем длину с использованием метода родительского класса Rectangle
	     super.setWidth(side); // Устанавливаем ширину с использованием метода родительского класса Rectangle
	 }
	
	 @Override
	 public String toString() {
	     return "Square[" + super.toString() + "]";
	 }
}


