package z2;

//Абстрактный класс, описывающий собаку
public abstract class Dog {
	 private String name;
	 private int age;
	
	 public Dog(String name, int age) {
	     this.name = name;
	     this.age = age;
	 }
	
	 // Абстрактный метод для вывода информации о собаке
	 public abstract void displayInfo();
	 
	 // Геттеры и сеттеры
	 public String getName() {
		 return name;
	 }

	 public void setName(String name) {
		 this.name = name;
	 }

	 public int getAge() {
		 return age;
	 }

	 public void setAge(int age) {
		 this.age = age;
	 }
}

