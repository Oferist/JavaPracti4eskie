package pr15_z3;

// Класс, запускающий приложение для управления списком задач 
public class TaskApp { 
	public static void main(String[] args) {
		// Создаем модель списка задач 
		TaskModel model = new TaskModel(); 
		// Создаем представление списка задач 
		TaskView view = new TaskView(model);
		// Создаем контроллер списка задач 
		TaskController controller = new TaskController(model); 
		// Передаем представление и контроллер друг другу 
		view.setController(controller); 
		controller.setView(view); 
	}
}
