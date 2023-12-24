package pr15_z3;

import java.awt.BorderLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;

// Класс, представляющий представление данных - вид списка задач 
public class TaskView extends JFrame { 
	
	// Поля класса - модель и контроллер задач, таблица, панель и кнопки 
	private TaskModel model; 
	private TaskController controller; 
	private JTable table; 
	private JPanel panel; 
	private JButton addButton; 
	private JButton deleteButton; 
	private JButton editButton; 
	private JButton markButton;
	private JButton unmarkButton;
	
	// Конструктор класса
	public TaskView(TaskModel model) {
	    // Инициализируем модель
	    this.model = model;

	    // Создаем таблицу с данными из модели
	    table = new JTable(model);

	    // Создаем панель с кнопками
	    panel = new JPanel();
	    addButton = new JButton("Add");
	    deleteButton = new JButton("Delete");
	    editButton = new JButton("Edit");
	    markButton = new JButton("Mark as done");
	    unmarkButton = new JButton("Unmark as done");

	    // Добавляем слушателей на кнопки
	    addButton.addActionListener(e -> controller.addTask());
	    deleteButton.addActionListener(e -> controller.deleteTask(table.getSelectedRow()));
	    editButton.addActionListener(e -> controller.editTask(table.getSelectedRow()));
	    markButton.addActionListener(e -> controller.markTask(table.getSelectedRow()));
	    unmarkButton.addActionListener(e -> controller.unmarkTask(table.getSelectedRow()));

	    // Добавляем кнопки на панель
	    panel.add(addButton);
	    panel.add(deleteButton);
	    panel.add(editButton);
	    panel.add(markButton);
	    panel.add(unmarkButton);

	    // Добавляем таблицу и панель на фрейм
	    add(new JScrollPane(table), BorderLayout.CENTER);
	    add(panel, BorderLayout.SOUTH);

	    // Устанавливаем свойства фрейма
	    setTitle("Task Manager");
	    setSize(600, 400);
	    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    setVisible(true);
	}
	
	// Сеттер для контроллера
	public void setController(TaskController controller) {
	    // Устанавливаем контроллер
	    this.controller = controller;
	}

	// Метод, обновляющий представление в соответствии с моделью
	public void updateView() {
	    // Обновляем данные в таблице
	    table.setModel(model);
	    // Обновляем заголовки столбцов
	    table.getColumnModel().getColumn(0).setHeaderValue("Name");
	    table.getColumnModel().getColumn(1).setHeaderValue("Description");
	    table.getColumnModel().getColumn(2).setHeaderValue("Deadline");
	    table.getColumnModel().getColumn(3).setHeaderValue("Done");
	}

}
