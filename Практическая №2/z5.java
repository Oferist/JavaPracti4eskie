package pr2;

/* Создать метод, вычисляющую факториал числа с помощью
   цикла, проверить работу метода. */

public class z5 {
	public static void main(String[] args) {
        int number = 5; // Число, для которого вычисляется факториал
        long factorial = calculateFactorial(number); // Вычисление факториала с использованием метода
        System.out.println("Факториал числа " + number + " равен: " + factorial);
    }

    // Метод для вычисления факториала числа с использованием цикла
    public static long calculateFactorial(int n) {
        long factorial = 1;
        for (int i = 1; i <= n; i++) {
            factorial *= i;
        }
        return factorial;
    }
}
