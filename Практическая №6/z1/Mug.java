package z1;

//Расширитель класса Dish - кружка
public class Mug extends Dish {
	 private String color;
	
	 public Mug(String material, int diameter, String color) {
	     super(material, diameter);
	     this.color = color;
	 }
	
	 @Override
	 public void displayInfo() {
	     System.out.println("Кружка: Материал - " + getMaterial() +
	             ", Диаметр - " + getDiameter() + " см" +
	             ", Цвет - " + color);
	 }
}
