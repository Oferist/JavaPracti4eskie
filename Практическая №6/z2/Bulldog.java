package z2;

//Расщиритель класса Dog - Бульдог
public class Bulldog extends Dog {
	private String color;
	
	public Bulldog(String name, int age, String color) {
		super(name, age);
		this.color = color;
	}
	
	// Переопределение метода для издания звука (гав-гав) бульдога
	@Override
	public void displayInfo() {
		System.out.println("Порода - Бульдог(Имя: " + getName() + ", " + "Возраст: " + getAge() + ", " + "Цвет: " + this.color + ")");
	}
}
