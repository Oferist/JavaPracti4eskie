package pr15_z1;

// Класс, представляющий представление данных - вид студента 
public class StudentView { 
	
	// Метод, отображающий детали студента 
	public void printStudentDetails(String name, String rollNo) { 
		System.out.println("Student: "); 
		System.out.println("Name: " + name); 
		System.out.println("Roll No: " + rollNo); 
	}
	// Конструктор класса
	public StudentView() {}
}
