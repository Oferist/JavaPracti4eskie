package pr2;

/* Сгенерировать массив целых чисел случайным образом, вывести его
   на экран, отсортировать его, и снова вывести на экран. */

import java.util.Arrays;
import java.util.Random;

public class z4 {
	public static void main(String[] args) {
        // Генерация массива целых чисел случайным образом
        int[] numbers = new int[10]; // Размер массива - 10 элементов
        Random random = new Random();
        System.out.println("Исходный массив:");
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = random.nextInt(100); // Генерация случайного числа от 0 до 99
            System.out.print(numbers[i] + " ");
        }

        // Сортировка массива
        Arrays.sort(numbers);

        // Вывод отсортированного массива
        System.out.println("\nОтсортированный массив:");
        for (int number : numbers) {
            System.out.print(number + " ");
        }
    }
}
