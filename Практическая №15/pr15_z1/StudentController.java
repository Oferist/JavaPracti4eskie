package pr15_z1;

import java.util.Scanner;

// Класс, представляющий контроллер данных - контроллер студента 
public class StudentController {
	
	// Поля класса - модель и представление студента 
	private Student model; 
	private StudentView view;
	
	// Конструктор класса
	public StudentController(Student model, StudentView view) {
	    this.model = model;
	    this.view = view;
	}

	// Метод, устанавливающий имя студента в модели
	public void setStudentName() {
	    // Запрашиваем имя студента у пользователя
	    System.out.print("Enter student name: ");
	    // Считываем имя студента с клавиатуры
	    Scanner scanner = new Scanner(System.in);
	    String name = scanner.nextLine();
	    // Присваиваем полю model.name введенное значение
	    model.setName(name);
	}

	// Метод, возвращающий имя студента из модели
	public String getStudentName() {
	    // Возвращаем поле model.name
	    return model.getName();
	}

	// Метод, устанавливающий номер студента в модели
	public void setStudentRollNo() {
	    // Запрашиваем номер студента у пользователя
	    System.out.print("Enter student roll no: ");
	    // Считываем номер студента с клавиатуры
	    Scanner scanner = new Scanner(System.in);
	    String rollNo = scanner.nextLine();
	    // Присваиваем полю model.rollNo введенное значение
	    model.setRollNo(rollNo);
	}

	// Метод, возвращающий номер студента из модели
	public String getStudentRollNo() {
	    // Возвращаем поле model.rollNo
	    return model.getRollNo();
	}

	// Метод, обновляющий представление студента в соответствии с моделью
	public void updateView() {
	    // Вызываем метод view.printStudentDetails с параметрами model.name и model.rollNo
	    view.printStudentDetails(model.getName(), model.getRollNo());
	}


}