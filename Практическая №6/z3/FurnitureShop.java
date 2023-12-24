package z3;

//Класс, представляющий магазин мебели
public class FurnitureShop {
	 private Furniture[] inventory;
	
	 public FurnitureShop(int capacity) {
	     inventory = new Furniture[capacity];
	 }
	
	 // Добавление мебели в магазин
	 public void addFurniture(Furniture furniture) {
	     for(int i = 0; i < inventory.length; i++) {
	         if (inventory[i] == null) {
	             inventory[i] = furniture;
	             System.out.println("Мебель добавлена в магазин: " + furniture.getName());
	             return;
	         }
	     }
	     System.out.println("Магазин мебели заполнен. Невозможно добавить больше мебели - " + furniture.getName());
	 }

	 // Вывод информации о доступной мебели в магазине
	 public void displayInventory() {
		 System.out.println("Доступная мебель в магазине:");
		 for(Furniture furniture : inventory) {
			 if (furniture != null) {
				 furniture.displayInfo();
		     }
		 }
	}
}
