package z1;

// Абстрактный класс, описывающий посуду
public abstract class Dish {
    private String material;
    private int diameter;

    public Dish(String material, int diameter) {
        this.material = material;
        this.diameter = diameter;
    }

    // Абстрактный метод для вывода информации о посуде
    public abstract void displayInfo();
    
	 // Геттеры и сеттеры
    public String getMaterial() {
		   return material;
    }
	
    public void setMaterial(String material) {
    	this.material = material;
	}
	
    public int getDiameter() {
    	return diameter;
	}
	
    public void setDiameter(int diameter) {
    	this.diameter = diameter;
	}
}
