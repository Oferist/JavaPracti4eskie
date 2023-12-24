package pr11_z2;

public class Student {
	String name;
    double gpa;

    // Конструктор класса Student
    public Student(String name, double gpa) {
        this.name = name;
        this.gpa = gpa;
    }

    // Геттер для получения GPA студента
    public double getGPA() {
        return gpa;
    }
}
