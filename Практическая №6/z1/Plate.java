package z1;

//Расширитель класса Dish - тарелка
public class Plate extends Dish {
	 private boolean isFlat;
	
	 public Plate(String material, int diameter, boolean isFlat) {
	     super(material, diameter);
	     this.isFlat = isFlat;
	 }
	
	 @Override
	 public void displayInfo() {
	     System.out.println("Тарелка: Материал - " + getMaterial() +
	             ", Диаметр - " + getDiameter() + " см" +
	             ", Плоская - " + isFlat);
	 }
}
