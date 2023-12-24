package pr15_z1;

// Класс, представляющий модель данных - студента 
public class Student { 
	
	// Поля класса - имя и номер студента 
	private String name; 
	private String rollNo;
	
	// Конструктор класса
	public Student(String name, String rollNo) {
	    this.name = name;
	    this.rollNo = rollNo;
	}

	// Геттеры и сеттеры для полей класса
	public String getName() {
	    return name;
	}

	public void setName(String name) {
	    this.name = name;
	}

	public String getRollNo() {
	    return rollNo;
	}

	public void setRollNo(String rollNo) {
	    this.rollNo = rollNo;
	}
}
