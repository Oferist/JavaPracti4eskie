package pr10;

import java.util.Scanner;

/* Треугольная последовательность:
	Дана монотонная последовательность, в которой каждое натуральное
	число k встречается ровно k раз: 1, 2, 2, 3, 3, 3, 4, 4, 4, 4,...  
	По данному натуральному n выведите первые n членов этой
	последовательности. Попробуйте обойтись только одним циклом for. */

public class z1 {
	public static void printTriangleSequence(int number, int count, int n) {
        if (count > n) {
            return;
        }

        for (int i = 1; i <= number; i++) {
            System.out.print(number + " ");
            count++;
            if (count > n) {
                return;
            }
        }

        printTriangleSequence(number + 1, count, n);
    }
	
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите количество членов последовательности: ");
        int n = scanner.nextInt();

        printTriangleSequence(1, 1, n);
    }
}
