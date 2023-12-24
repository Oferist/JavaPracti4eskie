package z3;

//Расширитель класса Furniture - стол
public class Table extends Furniture {
	private int numberOfLegs;

	public Table(String name, double price, int numberOfLegs) {
		super(name, price);
		this.numberOfLegs = numberOfLegs;
	}
	
	// Переопределение метода для вывода информации о столе
	@Override
	public void displayInfo() {
		System.out.println("Стол: " + getName() + ", Цена: " + getPrice() + "$" + ", Количество ножек: " + numberOfLegs);
	}
}
