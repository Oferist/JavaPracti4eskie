package pr16_z4;

import java.util.Scanner;

/* Оъяснение работы finally (или по другому: код, который должен быть выполнен в любом случае):
 * блок finally будет выполнен после блока try или после одного из блоков catch,
 * в зависимости от того, было ли выброшено исключение или нет. 
 * Блок finally полезен для того, чтобы освободить ресурсы, которые были использованы 
 * в блоке try, например, закрыть потоки, соединения, файлы и т.д.
 */

public class Exception4 {
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
		} finally {
			myScanner.close();
		}
	}
}
