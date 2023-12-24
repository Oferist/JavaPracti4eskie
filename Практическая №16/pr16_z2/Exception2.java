package pr16_z2;

import java.util.Scanner;

/* Объяснение шага 2 (подача на вход 1 - Qwerty, 2 - 0, 3 - 1.2):
 * 1) При вводе Qwerty программа выбросит исключение NumberFormatException, потому что строка Qwerty не может быть преобразована в целое число с помощью метода Integer.parseInt. Это исключение указывает на некорректный формат ввода.
 * 2) При вводе 0 программа выбросит исключение ArithmeticException, потому что деление на ноль является недопустимой математической операцией. Это исключение указывает на арифметическую ошибку.
 * 3) При вводе 1.2 программа также выбросит исключение NumberFormatException, потому что строка 1.2 не может быть преобразована в целое число с помощью метода Integer.parseInt.
*/

public class Exception2 {
	public static void main(String[] args) {
		exceptionDemo();
	}
	
	public static void exceptionDemo() {
		Scanner myScanner = new Scanner(System.in);
		System.out.print( "Enter an integer ");
		String intString = myScanner.next();
		try {
			int i = Integer.parseInt(intString);
			System.out.println( 2/i );
		} catch (NumberFormatException e1) {
			System.out.println("Некорректный ввод");
		} catch (ArithmeticException e2) {
			System.out.println("Нельзя делить на ноль");
		}
		myScanner.close();
	}
}
