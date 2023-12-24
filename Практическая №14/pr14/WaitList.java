package pr14;

import java.util.Collection;
import java.util.concurrent.ConcurrentLinkedQueue;

// Класс для обычного списка ожидания
public class WaitList<E> implements IWaitList<E> {
	// Поле для хранения элементов в виде потокобезопасной очереди 
	protected ConcurrentLinkedQueue<E> content;
	
	// Конструктор без параметров, создает пустую очередь
	public WaitList() {
	    content = new ConcurrentLinkedQueue<>();
	}

	// Конструктор с параметром, создает очередь из коллекции элементов
	public WaitList(Collection<E> c) {
	    content = new ConcurrentLinkedQueue<>(c);
	}

	// Реализация метода добавления элемента
	@Override
	public void add(E element) {
	    content.add(element);
	}

	// Реализация метода удаления и возврата элемента
	@Override
	public E remove() {
	    return content.poll();
	}

	// Реализация метода проверки наличия элемента
	@Override
	public boolean contains(E element) {
	    return content.contains(element);
	}
	
	// Реализация метода проверки наличия всех элементов из коллекции
	@Override
	public boolean containsAll(Collection<E> c) {
	    return content.containsAll(c);
	}

	// Реализация метода проверки пустоты очереди
	@Override
	public boolean isEmpty() {
	    return content.isEmpty();
	}

	// Переопределение метода toString() для вывода содержимого очереди
	@Override
	public String toString() {
	    return content.toString();
	}
}
