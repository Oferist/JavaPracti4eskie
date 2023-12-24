package z3;

//Расширитель класса Furniture - стул
public class Chair extends Furniture {
	 public Chair(String name, double price) {
	     super(name, price);
	 }
	
	 // Переопределение метода для вывода информации о стуле
	 @Override
	 public void displayInfo() {
	     System.out.println("Стул: " + getName() + ", Цена: " + getPrice() + "$");
	 }
}
