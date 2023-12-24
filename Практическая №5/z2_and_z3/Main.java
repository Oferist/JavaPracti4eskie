package z2_and_z3;

public class Main {
	public static void main(String[] args) {
		Shape s1 = new Circle(5.5, "RED", false); 
		System.out.println(s1); 
		System.out.println(s1.getArea()); 
		System.out.println(s1.getPerimeter()); 
		System.out.println(s1.getColor());
		System.out.println(s1.isFilled());
		// System.out.println(s1.getRadius()); // Этот вызов вызовет ошибку компиляции, так как метод getRadius() не определен в классе Shape
		
		Circle c1 = (Circle)s1; // downcast back to Circle
		System.out.println(c1);
		System.out.println(c1.getArea());
		System.out.println(c1.getPerimeter());
		System.out.println(c1.getColor());
		System.out.println(c1.isFilled());
		System.out.println(c1.getRadius());
		
		// Shape s2 = new Shape(); // Этот вызов вызовет ошибку компиляции, так как Shape - это абстрактный класс и нельзя создать объект абстрактного класса напрямую
		
		Shape s3 = new Rectangle(1.0, 2.0, "RED", false); // upcast
		System.out.println(s3);
		System.out.println(s3.getArea());
		System.out.println(s3.getPerimeter()); 
		System.out.println(s3.getColor());
		// System.out.println(s3.getLength()); // Этот вызов вызовет ошибку компиляции, так как метод getLength() не определен в классе Shape
		
		Rectangle r1 = (Rectangle)s3; // downcast
		System.out.println(r1);
		System.out.println(r1.getArea());
		System.out.println(r1.getColor());
		System.out.println(r1.getLength());
		
		Shape s4 = new Square(6.6); // Upcast
		System.out.println(s4);
		System.out.println(s4.getArea());
		System.out.println(s4.getColor());
		// System.out.println(s4.getSide()); // Этот вызов вызовет ошибку компиляции, так как метод getSide() не определен в классе Shape
		
		// Take note that we downcast Shape s4 to Rectangle,
		// which is a superclass of Square, instead of Square
		Rectangle r2 = (Rectangle)s4;
		System.out.println(r2);
		System.out.println(r2.getArea());
		System.out.println(r2.getColor());
		// System.out.println(r2.getSide()); // Этот вызов вызовет ошибку компиляции, так как метод getSide() не определен в классе Rectangle
		System.out.println(r2.getLength());
		
		// Downcast Rectangle r2 to Square
		Square sq1 = (Square)r2;
		System.out.println(sq1);
		System.out.println(sq1.getArea());
		System.out.println(sq1.getColor());
		System.out.println(sq1.getSide());
		System.out.println(sq1.getLength());

	}
}
