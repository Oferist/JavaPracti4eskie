package pr15_z2;

// Класс, представляющий модель данных - сотрудника 
public class Employee { 
	
	// Поля класса - имя, должность, ставка, отработанные часы и зарплата сотрудника 
	private String name; 
	private String position; 
	private double rate; 
	private int hours; 
	private double salary;
	
	// Конструктор класса
	public Employee(String name, String position, double rate, int hours) {
	    this.name = name;
	    this.position = position;
	    this.rate = rate;
	    this.hours = hours;
	    this.salary = 0;
	}

	// Геттеры и сеттеры для полей класса
	public String getName() {
	    return name;
	}

	public void setName(String name) {
	    this.name = name;
	}

	public String getPosition() {
	    return position;
	}

	public void setPosition(String position) {
	    this.position = position;
	}

	public double getRate() {
	    return rate;
	}

	public void setRate(double rate) {
	    this.rate = rate;
	}

	public int getHours() {
	    return hours;
	}

	public void setHours(int hours) {
	    this.hours = hours;
	}

	public double getSalary() {
	    return salary;
	}

	public void setSalary(double salary) {
	    this.salary = salary;
	}
	
}
