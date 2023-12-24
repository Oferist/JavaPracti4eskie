package pr15_z2;

import pr15_z1.Student;

// Класс, демонстрирующий работу паттерна MVC 
public class MVCPatternDemo { 
	public static void main(String[] args) { 
		
		// Создаем модель сотрудника 
		Employee model = retrieveEmployeeFromDatabase();
		
	    // Создаем представление сотрудника
	    EmployeeView view = new EmployeeView();

	    // Создаем контроллер сотрудника
	    EmployeeController controller = new EmployeeController(model, view);

	    // Обновляем представление сотрудника
	    controller.updateView();

	    // Рассчитываем зарплату сотрудника
	    controller.calculateSalary();

	    // Обновляем представление сотрудника
	    controller.updateView();

	}
	
	// Метод, возвращающий модель сотдрудника из базы данных
	public static Employee retrieveEmployeeFromDatabase() {
		// Заглушка для базы данных
		return new Employee("Ivan", "Programmer", 1000, 160);
	}
}
