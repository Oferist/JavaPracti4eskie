package pr15_z2;

// Класс, представляющий контроллер данных - контроллер сотрудника 
public class EmployeeController { 
	
	// Поля класса - модель и представление сотрудника 
	private Employee model; 
	private EmployeeView view;
	
	// Конструктор класса
	public EmployeeController(Employee model, EmployeeView view) {
	    this.model = model;
	    this.view = view;
	}

	// Метод, расчитывающий зарплату сотрудника в зависимости от ставки и отработанных часов
	public void calculateSalary() {
	    // Получаем ставку и часы из модели
	    double rate = model.getRate();
	    int hours = model.getHours();
	    // Рассчитываем зарплату по формуле: зарплата = ставка * часы
	    double salary = rate * hours;
	    // Устанавливаем зарплату в модели
	    model.setSalary(salary);
	}

	// Метод, обновляющий представление сотрудника в соответствии с моделью
	public void updateView() {
	    // Вызываем метод view.showEmployeeDetails с параметрами из модели
	    view.showEmployeeDetails(model.getName(), model.getPosition(), model.getRate(), model.getHours(), model.getSalary());
	}

}
