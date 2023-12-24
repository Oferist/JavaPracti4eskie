package pr11_z1;

public class InsertionSortTest {
    public static void main(String[] args) {
        // Создаем массив объектов Student
        Student[] students = {
                new Student(51),
                new Student(25),
                new Student(18),
                new Student(37),
                new Student(3)
        };

        // Выводим неотсортированный массив
        System.out.println("Неотсортированный массив:");
        printArray(students);

        // Сортируем массив объектов Student с использованием сортировки вставками
        insertionSort(students);

        // Выводим отсортированный массив
        System.out.println("\nОтсортированный массив:");
        printArray(students);
    }

    // Метод для сортировки массива объектов Comparable с использованием сортировки вставками
    private static void insertionSort(Student[] array) {
        int n = array.length;
        for (int i = 1; i < n; ++i) {
            Student key = array[i];
            int j = i - 1;

            // Перемещаем элементы массива, которые больше key, на одну позицию вперед
            while (j >= 0 && array[j].compareTo(key) > 0) {
                array[j + 1] = array[j];
                j = j - 1;
            }
            array[j + 1] = key;

            // Выводим промежуточный результат после каждого шага сортировки
            System.out.println("Шаг " + i + ": ");
            printArray(array);
        }
    }

    // Метод для вывода массива объектов в консоль
    private static void printArray(Student[] array) {
        for (Student student : array) {
            System.out.println(student);
        }
        System.out.println();
    }
}