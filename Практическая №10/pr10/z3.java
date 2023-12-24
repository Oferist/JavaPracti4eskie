package pr10;

import java.util.Scanner;

/* От A до B
	Даны два целых числа A и В (каждое в отдельной строке). Выведите все
	числа от A до B включительно, в порядке возрастания, если A < B, или в
	порядке убывания в противном случае. */

public class z3 {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите A:");
        int a = scanner.nextInt();

        System.out.println("Введите B:");
        int b = scanner.nextInt();

        if (a < b) {
            printAscending(a, b);
        } else {
            printDescending(a, b);
        }

        scanner.close();
    }

    // Вывод чисел от A до B включительно в порядке возрастания
    private static void printAscending(int a, int b) {
        if (a <= b) {
            System.out.print(a + " ");
            printAscending(a + 1, b);
        }
    }

    // Вывод чисел от A до B включительно в порядке убывания
    private static void printDescending(int a, int b) {
        if (a >= b) {
            System.out.print(a + " ");
            printDescending(a - 1, b);
        }
    }
}
