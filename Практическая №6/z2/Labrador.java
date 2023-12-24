package z2;

//Расширитель класса Dog - Лабрадор
public class Labrador extends Dog {
	private String color;
	
	public Labrador(String name, int age, String color) {
		super(name, age);
		this.color = color;
    }
	
	 // Переопределение метода вывода информации
	 @Override
	 public void displayInfo() {
	     System.out.println("Порода - Лабрадор(Имя: " + getName() + ", " + "Возраст: " + getAge() + ", " + "Цвет: " + this.color + ")");
	 }
}
