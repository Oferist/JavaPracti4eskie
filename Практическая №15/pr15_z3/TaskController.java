package pr15_z3;

import java.time.LocalDate;
import java.time.format.DateTimeParseException;

import javax.swing.JOptionPane;

// Класс, представляющий контроллер данных - контроллер списка задач 
public class TaskController { 
	// Поля класса - модель и представление задач 
	private TaskModel model; 
	private TaskView view;
	
	// Конструктор класса
	public TaskController(TaskModel model) {
	    this.model = model;
	}
	
	// Сеттер для представления
	public void setView(TaskView view) {
	    // Устанавливаем представление
	    this.view = view;
	}

	// Метод, добавляющий новую задачу в модель
	public void addTask() {
	    // Запрашиваем данные для новой задачи у пользователя
	    String name = JOptionPane.showInputDialog("Enter task name");
	    String description = JOptionPane.showInputDialog("Enter task description");
	    String deadline = JOptionPane.showInputDialog("Enter task deadline (yyyy-mm-dd)");
	    // Проверяем, что данные не пустые
	    if (name != null && !name.isEmpty() && description != null && !description.isEmpty() && deadline != null && !deadline.isEmpty()) {
	        try {
	            // Парсим дату из строки
	            LocalDate date = LocalDate.parse(deadline);
	            // Создаем новую задачу с введенными данными
	            Task task = new Task(name, description, date);
	            // Добавляем задачу в модель
	            model.addTask(task);
	            // Обновляем представление
	            view.updateView();
	        } catch (DateTimeParseException e) {
	            // Выводим сообщение об ошибке, если дата неверного формата
	            JOptionPane.showMessageDialog(null, "Invalid date format");
	        }
	    }
	}

	// Метод, удаляющий задачу из модели по индексу
	public void deleteTask(int index) {
	    // Проверяем, что индекс в допустимом диапазоне
	    if (index >= 0 && index < model.getRowCount()) {
	        // Удаляем задачу из модели
	        model.deleteTask(index);
	        // Обновляем представление
	        view.updateView();
	    }
	}

	// Метод, редактирующий задачу в модели по индексу
	public void editTask(int index) {
	    // Проверяем, что индекс в допустимом диапазоне
	    if (index >= 0 && index < model.getRowCount()) {
	        // Получаем задачу из модели по индексу
	        Task task = model.getTask(index);
	        // Запрашиваем новые данные для задачи у пользователя
	        String name = JOptionPane.showInputDialog("Enter new task name", task.getName());
	        String description = JOptionPane.showInputDialog("Enter new task description", task.getDescription());
	        String deadline = JOptionPane.showInputDialog("Enter new task deadline (yyyy-mm-dd)", task.getDeadline());
	        // Проверяем, что данные не пустые
	        if (name != null && !name.isEmpty() && description != null && !description.isEmpty() && deadline != null && !deadline.isEmpty()) {
	            try {
	                // Парсим дату из строки
	                LocalDate date = LocalDate.parse(deadline);
	                // Устанавливаем новые данные для задачи
	                task.setName(name);
	                task.setDescription(description);
	                task.setDeadline(date);
	                // Обновляем представление
	                view.updateView();
	            } catch (DateTimeParseException e) {
	                // Выводим сообщение об ошибке, если дата неверного формата
	                JOptionPane.showMessageDialog(null, "Invalid date format");
	            }
	        }
	    }
	}

	// Метод, отмечающий задачу как выполненную в модели по индексу
	public void markTask(int index) {
	    // Проверяем, что индекс в допустимом диапазоне
	    if (index >= 0 && index < model.getRowCount()) {
	        // Получаем задачу из модели по индексу
	        Task task = model.getTask(index);
	        // Устанавливаем статус задачи как выполненный
	        task.setDone(true);
	        // Обновляем представление
	        view.updateView();
	    }
	}
	
	// Метод, снимающий галочку с задачи в модели по индексу 
	public void unmarkTask(int index) { 
		// Проверяем, что индекс в допустимом диапазоне 
		if (index >= 0 && index < model.getRowCount()) { 
			// Получаем задачу из модели по индексу 
			Task task = model.getTask(index); 
			// Устанавливаем статус задачи как невыполненный 
			task.setDone(false); 
			// Обновляем представление 
			view.updateView();
		}
	}

	// Метод, обновляющий представление в соответствии с моделью
	public void updateView() {
	    // Вызываем метод view.updateView, который показывает список задач в таблице
	    view.updateView();
	}

}
