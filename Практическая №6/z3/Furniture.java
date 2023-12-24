package z3;

//Абстрактный класс, описывающий мебель
public abstract class Furniture {
	 private String name;
	 private double price;
	
	 public Furniture(String name, double price) {
	     this.name = name;
	     this.price = price;
	 }
	
	 // Геттеры и сеттеры
	 public String getName() {
	     return name;
	 }
	
	 public void setName(String name) {
	     this.name = name;
	 }
	
	 public double getPrice() {
	     return price;
	 }
	
	 public void setPrice(double price) {
	     this.price = price;
	 }
	
	 // Абстрактный метод для вывода информации о мебели
	 public abstract void displayInfo();
}

