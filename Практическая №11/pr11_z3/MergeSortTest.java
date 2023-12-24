package pr11_z3;

import java.util.ArrayList;
import java.util.List;

public class MergeSortTest {

    public static void main(String[] args) {
        // Создаем два неотсортированных списка студентов
        List<Student> list1 = new ArrayList<>();
        list1.add(new Student("Алиса", 22));
        list1.add(new Student("Дима", 20));
        list1.add(new Student("Алёна", 25));

        List<Student> list2 = new ArrayList<>();
        list2.add(new Student("Кирилл", 19));
        list2.add(new Student("Александр", 21));
        list2.add(new Student("Ева", 24));
        
        // Выводим исходные списки
        System.out.println("Исходный список студентов 1:");
        for (Student student : list1) {
            System.out.println(student);
        }

        System.out.println("\nИсходный список студентов 2:");
        for (Student student : list2) {
            System.out.println(student);
        }
        

        // Объединяем списки и сортируем их
        List<Student> mergedList = mergeAndSort(list1, list2);

        // Выводим отсортированный список
        System.out.println("\nОтсортированный список студентов:");
        for (Student student : mergedList) {
            System.out.println(student);
        }
    }

    // Метод для объединения и сортировки списков слиянием
    public static List<Student> mergeAndSort(List<Student> list1, List<Student> list2) {
        // Создаем копии списков
        List<Student> mergedList = new ArrayList<>(list1);
        mergedList.addAll(new ArrayList<>(list2));

        // Сортируем объединенный список
        mergeSort(mergedList);

        return mergedList;
    }

    // Рекурсивный метод сортировки слиянием
    private static void mergeSort(List<Student> list) {
        if (list.size() > 1) {
            int mid = list.size() / 2;
            List<Student> leftHalf = new ArrayList<>(list.subList(0, mid));
            List<Student> rightHalf = new ArrayList<>(list.subList(mid, list.size()));

            mergeSort(leftHalf);
            mergeSort(rightHalf);

            merge(list, leftHalf, rightHalf);
        }
    }

    // Метод для слияния двух отсортированных списков
    private static void merge(List<Student> result, List<Student> left, List<Student> right) {
        int i = 0, j = 0, k = 0;

        while (i < left.size() && j < right.size()) {
            if (left.get(i).compareTo(right.get(j)) < 0) {
                result.set(k++, left.get(i++));
            } else {
                result.set(k++, right.get(j++));
            }
        }

        while (i < left.size()) {
            result.set(k++, left.get(i++));
        }

        while (j < right.size()) {
            result.set(k++, right.get(j++));
        }
    }
}