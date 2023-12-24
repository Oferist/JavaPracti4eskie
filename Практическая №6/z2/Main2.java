package z2;

public class Main2 {
	public static void main(String[] args) {
	     // Создаем объекты собак различных пород
	     Labrador labrador = new Labrador("Барон", 3, "Чёрный");
	     Bulldog bulldog = new Bulldog("Рекс", 5, "Белый");
	
	     // Выводим информацию о собаках
	     labrador.displayInfo();
	     bulldog.displayInfo();
	 }
}
