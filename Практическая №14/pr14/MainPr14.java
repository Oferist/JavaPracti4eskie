package pr14;

import java.util.Arrays;

// Класс для тестирования работы списков ожидания
public class MainPr14 {
	public static void main(String[] args) { 
		
		// Создаем обычный список ожидания из четырех элементов 
		WaitList<Integer> waitList = new WaitList<>(Arrays.asList(1, 2, 3, 4)); 
		
		// Выводим его содержимое 
		System.out.println("WaitList: " + waitList); 
		
		// Добавляем новый элемент 
		waitList.add(5); 
		
		// Выводим его содержимое 
		System.out.println("WaitList: " + waitList); 
		
		// Удаляем и возвращаем первый элемент 
		System.out.println("Removed: " + waitList.remove()); 
		
		// Выводим его содержимое 
		System.out.println("WaitList: " + waitList); 
		
		// Проверяем, содержит ли он элемент 3 
		System.out.println("Contains 3: " + waitList.contains(3)); 
		
		// Проверяем, пуст ли он 
		System.out.println("Is empty: " + waitList.isEmpty());
	    
		// Создаем ограниченный список ожидания с емкостью 3
	    BoundedWaitList<String> boundedWaitList = new BoundedWaitList<>(3);
	    
	    // Выводим его содержимое и емкость
	    System.out.println("BoundedWaitList: " + boundedWaitList);
	    
	    // Добавляем три элемента
	    boundedWaitList.add("a");
	    boundedWaitList.add("b");
	    boundedWaitList.add("c");
	    
	    // Выводим его содержимое и емкость
	    System.out.println("BoundedWaitList: " + boundedWaitList);
	    
	    // Пытаемся добавить еще один элемент
	    boundedWaitList.add("d");
	    
	    // Выводим его содержимое и емкость
	    System.out.println("BoundedWaitList: " + boundedWaitList);
	    
	    // Возвращаем емкость списка
	    System.out.println("Capacity: " + boundedWaitList.getCapacity());

	    // Создаем несправедливый список ожидания из пяти элементов
	    UnfairWaitList<Character> unfairWaitList = new UnfairWaitList<>(Arrays.asList('x', 'y', 'z', 'w', 'v'));
	    
	    // Выводим его содержимое
	    System.out.println("UnfairWaitList: " + unfairWaitList);
	    
	    // Пытаемся удалить первый элемент
	    unfairWaitList.remove();
	    
	    // Выводим его содержимое
	    System.out.println("UnfairWaitList: " + unfairWaitList);
	    
	    // Удаляем элемент z
	    unfairWaitList.remove('z');
	    
	    // Выводим его содержимое
	    System.out.println("UnfairWaitList: " + unfairWaitList);
	    
	    // Перемещаем элемент y в конец очереди
	    unfairWaitList.moveToBack('y');
	   
	    // Выводим его содержимое
	    System.out.println("UnfairWaitList: " + unfairWaitList);
	}
}
