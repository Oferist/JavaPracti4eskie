package pr15_z1;

// Класс, демонстрирующий работу паттерна MVC
public class MVCPatternDemo {
	public static void main(String[] args) { 
		
		// Создаем модель студента 
		Student model = retrieveStudentFromDatabase();
		
	    // Создаем представление студента
	    StudentView view = new StudentView();

	    // Создаем контроллер студента
	    StudentController controller = new StudentController(model, view);

	    // Обновляем представление студента
	    controller.updateView();

	    // Устанавливаем новое имя студента в модели
	    controller.setStudentName();

	    // Обновляем представление студента
	    controller.updateView();
	}

	// Метод, возвращающий модель студента из базы данных
	public static Student retrieveStudentFromDatabase() {
	    // Заглушка для базы данных
	    return new Student("Alex", "456");
	}

}
