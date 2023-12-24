package pr14;

// Класс для ограниченного списка ожидания 
public class BoundedWaitList<E> extends WaitList<E> { 
	
	// Поле для хранения емкости очереди private 
	int capacity;
	
	// Конструктор с параметром, создает пустую очередь с заданной емкостью
	public BoundedWaitList(int capacity) {
	    super(); // вызов конструктора суперкласса
	    this.capacity = capacity;
	}

	// Геттер для поля емкости
	public int getCapacity() {
	    return capacity;
	}

	// Переопределение метода добавления элемента
	@Override
	public void add(E element) {
	    // Проверяем, не превышена ли емкость очереди
	    if (content.size() < capacity) {
	        // Если нет, то добавляем элемент в конец очереди
	        super.add(element);
	    } else {
	        // Если да, то выводим сообщение об ошибке
	        System.out.println("The wait list is full. Cannot add " + element);
	    }
	}

	// Переопределение метода toString() для вывода содержимого и емкости очереди
	@Override
	public String toString() {
	    return "Capacity: " + capacity + ", Content: " + content;
	}

}
