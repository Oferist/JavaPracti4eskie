package pr16_z3;

import java.util.Scanner;

/* Объяснение 3 задания:
 * Вместо того, чтобы переходить в блоки catch, 
 * которые обрабатывают конкретные типы исключений, 
 * программа будет переходить в блок catch, 
 * который обрабатывает общее исключение. 
 * Это потому, что класс Exception является суперклассом 
 * для всех других классов исключений, и поэтому он может 
 * перехватывать любое исключение. Однако, это не очень хорошая практика, 
 * так как вы теряете информацию о типе и причине исключения, и не можете 
 * обработать его соответствующим образом. Поэтому лучше всего 
 * обрабатывать общий тип в конце всех определённых блоков catch
 */

public class Exception3 {
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
		} catch(Exception e) {
			System.out.println("Обработка общего исключения");
		}
		myScanner.close();
	}
}
