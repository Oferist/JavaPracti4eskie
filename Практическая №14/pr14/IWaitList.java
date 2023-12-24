package pr14;

import java.util.Collection;

// Интерфейс для работы с очередью
public interface IWaitList<E> { 
	// Добавляет элемент в конец очереди 
	void add(E element); 
	// Удаляет и возвращает первый элемент из очереди 
	E remove(); 
	// Проверяет, содержит ли очередь данный элемент 
	boolean contains(E element); 
	// Проверяет, содержит ли очередь все элементы из заданной коллекции 
	boolean containsAll(Collection<E> c);
	// Проверяет, пуста ли очередь 
	boolean isEmpty(); 
}