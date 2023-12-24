package z2_pr9;

public class Main {
	 public static void main(String[] args) {
		 Product phone = new Product("Смартфон", 99.99);
	     Service consulting = new Service("Консультирование", 10.0);

	     System.out.println("Цена смартфона: " + phone.getPrice() + "$");
	     System.out.println("Почасовая оплата консультационных услуг: " + consulting.getPrice() + "$");
	 }
}
