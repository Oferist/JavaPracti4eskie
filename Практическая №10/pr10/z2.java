package pr10;

import java.util.Scanner;

/* От 1 до n
	Дано натуральное число n. Выведите все числа от 1 до n. */

public class z2 {	
	public static void printNumbers(int n) {
		if(n > 1) {
			printNumbers(n - 1);
		}
		System.out.print(n + " ");
		if(n % 15 == 0) {
			System.out.print("\n");
		}
	}
	
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите натуральное число n: ");
        int n = scanner.nextInt();
        printNumbers(n);
    }
}
