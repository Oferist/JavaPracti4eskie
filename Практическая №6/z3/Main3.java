package z3;

public class Main3 {
	public static void main(String[] args) {
	     // Создаем мебель
	     Chair chair = new Chair("Кожаный стул", 150.99);
	     Table table = new Table("Деревянный стол", 299.99, 6);
	     Chair chair1 = new Chair("Металлический стул", 199.99);
	
	     // Создаем магазин мебели и добавляем мебель в магазин
	     FurnitureShop shop = new FurnitureShop(2);
	     shop.addFurniture(chair);
	     shop.addFurniture(table);
	     shop.addFurniture(chair1);
	
	     // Выводим информацию о доступной мебели в магазине
	     shop.displayInventory();
	 }
}
