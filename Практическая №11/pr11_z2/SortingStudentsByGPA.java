package pr11_z2;

import java.util.Comparator;

public class SortingStudentsByGPA implements Comparator<Student> {

    // Реализация метода compare для интерфейса Comparator
    @Override
    public int compare(Student student1, Student student2) {
        // Сравниваем студентов по убыванию GPA
        return Double.compare(student2.getGPA(), student1.getGPA());
    }

    // Метод для выполнения быстрой сортировки
    public void quickSort(Student[] students, int low, int high) {
        if (low < high) {
            // Шаг 1: Находим индекс опорного элемента (разбиение массива)
            int pi = partition(students, low, high);

            // Шаг 2: Рекурсивно сортируем два подмассива
            quickSort(students, low, pi - 1);
            quickSort(students, pi + 1, high);
        }
    }

    // Метод для разбиения массива и возврата индекса опорного элемента
    private int partition(Student[] students, int low, int high) {
        double pivot = students[high].getGPA();
        int i = low - 1;

        for (int j = low; j < high; j++) {
            if (students[j].getGPA() >= pivot) {
                i++;

                // Шаг 3: Обмен элементов
                Student temp = students[i];
                students[i] = students[j];
                students[j] = temp;
            }
        }

        // Шаг 4: Обмен опорного элемента
        Student temp = students[i + 1];
        students[i + 1] = students[high];
        students[high] = temp;

        // Шаг 5: Возвращаем индекс опорного элемента
        return i + 1;
    }

    public static void main(String[] args) {
        // Создаем массив студентов
        Student[] students = {
                new Student("Алиса", 3.8),
                new Student("Дима", 3.5),
                new Student("Алексей", 4.0),
                new Student("Оля", 3.2),
                new Student("Ева", 3.9)
        };

        // Выводим исходный массив
        System.out.println("Исходный массив:");
        for (Student student : students) {
            System.out.println(student.name + ": " + student.gpa);
        }
        System.out.println();

        // Создаем объект SortingStudentsByGPA
        SortingStudentsByGPA sorter = new SortingStudentsByGPA();

        // Сортируем массив методом быстрой сортировки
        sorter.quickSort(students, 0, students.length - 1);

        // Выводим отсортированный массив
        System.out.println("Отсортированный массив по убыванию GPA:");
        for (Student student : students) {
            System.out.println(student.name + ": " + student.gpa);
        }
    }
}
