package pr2;

/* Вывести на экран аргументы командной строки в цикле for. */

public class z2 {
	public static void main(String[] args) {
        // Проверка, есть ли аргументы
        if (args.length == 0) {
            System.out.println("Нет аргументов командной строки");
            return;
        }

        // Вывод аргументов командной строки
        for (int i = 0; i < args.length; i++) {
            System.out.println("Аргумент " + (i + 1) + ": " + args[i]);
        }
    }
}
