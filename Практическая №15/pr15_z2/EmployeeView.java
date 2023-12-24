package pr15_z2;

// Класс, представляющий представление данных - вид сотрудника 
public class EmployeeView {
	
	// Метод, отображающий детали сотрудника 
	public void showEmployeeDetails(String name, String position, double rate, int hours, double salary) { 
		System.out.println("Employee: "); 
		System.out.println("Name: " + name); 
		System.out.println("Position: " + position); 
		System.out.println("Rate: " + rate); 
		System.out.println("Hours: " + hours); 
		System.out.println("Salary: " + salary); 
	} 
	
	EmployeeView() {};
	
}
