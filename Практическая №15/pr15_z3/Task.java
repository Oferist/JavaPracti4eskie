package pr15_z3;

import java.time.LocalDate;

// Класс, представляющий модель данных - задачу 
public class Task { 
	
	// Поля класса - название, описание, срок и статус задачи 
	private String name; 
	private String description; 
	private LocalDate deadline; 
	private boolean done;
	
	// Конструктор класса
	public Task(String name, String description, LocalDate deadline) {
	    this.name = name;
	    this.description = description;
	    this.deadline = deadline;
	    this.done = false;
	}

	// Геттеры и сеттеры для полей класса
	public String getName() {
	    return name;
	}

	public void setName(String name) {
	    this.name = name;
	}

	public String getDescription() {
	    return description;
	}

	public void setDescription(String description) {
	    this.description = description;
	}

	public LocalDate getDeadline() {
	    return deadline;
	}

	public void setDeadline(LocalDate deadline) {
	    this.deadline = deadline;
	}

	public boolean isDone() {
	    return done;
	}

	public void setDone(boolean done) {
	    this.done = done;
	}

}
