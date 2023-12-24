package z1_pr9;

public class Main {
	 public static void main(String[] args) {
	     Planet earth = new Planet("Земля");
	     Car car = new Car("BMW X5");
	     Animal dog = new Animal("Жираф");

	     System.out.println("Название планеты: " + earth.getName());
	     System.out.println("Название машины: " + car.getName());
	     System.out.println("Название животного: " + dog.getName());
	 }
}
