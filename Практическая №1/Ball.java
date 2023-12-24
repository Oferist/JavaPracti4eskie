package pr1;

public class Ball {
    private String color;
    private double radius;

    // Конструктор класса Мяч
    public Ball(String color, double radius) {
        this.color = color;
        this.radius = radius;
    }

    // Геттер для цвета мяча
    public String getColor() {
        return color;
    }

    // Геттер для радиуса мяча
    public double getRadius() {
        return radius;
    }

    // Метод для изменения цвета мяча
    public void setColor(String color) {
        this.color = color;
    }

    // Метод для изменения радиуса мяча
    public void setRadius(double radius) {
        this.radius = radius;
    }

    // Переопределение метода toString() для вывода информации о мяче
    @Override
    public String toString() {
        return "Мяч(" +
                "цвет='" + color + '\'' +
                ", радиус=" + radius +
                ')';
    }

    // Класс-тестер для тестирования класса Мяч
    public static void main(String[] args) {
        // Создание объекта мяча
        Ball myBall = new Ball("красный", 10.0);

        // Вывод информации о мяче с использованием метода toString()
        System.out.println("Мой мяч: " + myBall);

        // Изменение цвета и радиуса мяча
        myBall.setColor("синий");
        myBall.setRadius(15.0);

        // Вывод обновленной информации о мяче
        System.out.println("Мой мяч: " + myBall);
    }
}

