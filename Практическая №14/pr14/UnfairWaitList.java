package pr14;

import java.util.Collection;

// Класс для несправедливого списка ожидания 
public class UnfairWaitList<E> extends WaitList<E> { 
	
	// Конструктор без параметров, создает пустую очередь 
	public UnfairWaitList() { 
		super(); // вызов конструктора суперкласса 
	}
	
	public UnfairWaitList(Collection<E> c) {
		super(c);
	}
	// Переопределение метода удаления элемента
	@Override
	public E remove() {
	    // Выводим сообщение об ошибке, так как этот метод не должен использоваться
	    System.out.println("Cannot remove the first element. Use remove(element) instead.");
	    return null;
	}

	// Метод для удаления заданного элемента из очереди
	public void remove(E element) {
	    // Проверяем, не является ли элемент первым в очереди
	    if (content.peek().equals(element)) {
	        // Если да, то выводим сообщение об ошибке, так как первый элемент не может быть удален
	        System.out.println("Cannot remove the first element. Use moveToFront(element) instead.");
	    } else {
	        // Если нет, то удаляем элемент из очереди
	        content.remove(element);
	    }
	}

	// Метод для перемещения заданного элемента в начало очереди
	public void moveToBack(E element) {
	    // Проверяем, содержит ли очередь данный элемент
	    if (content.contains(element)) {
	        // Если да, то удаляем его из очереди и добавляем в начало
	        content.remove(element);
	        content.add(element);
	    } else {
	        // Если нет, то выводим сообщение об ошибке
	        System.out.println("The wait list does not contain " + element);
	    }
	}

}
