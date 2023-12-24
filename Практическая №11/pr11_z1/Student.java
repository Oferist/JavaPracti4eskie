package pr11_z1;

public class Student implements Comparable<Student> {
    private int iDNumber;

    // Конструктор
    public Student(int iDNumber) {
        this.iDNumber = iDNumber;
    }

    // Геттер и сеттер для iDNumber
    public int getIDNumber() {
        return iDNumber;
    }

    public void setIDNumber(int iDNumber) {
        this.iDNumber = iDNumber;
    }

    // Реализация метода compareTo для интерфейса Comparable
    @Override
    public int compareTo(Student otherStudent) {
        // Сравниваем объекты Student по iDNumber
        return Integer.compare(this.iDNumber, otherStudent.iDNumber);
    }

    // Переопределяем метод toString() для удобного вывода информации
    @Override
    public String toString() {
        return "Студент{" +
                "НомерID=" + iDNumber +
                '}';
    }
}