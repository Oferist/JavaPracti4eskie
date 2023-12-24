package pr4;

public class CircleTest {
    public static void main(String[] args) {
        // Создаем объект окружности с радиусом 5
        Circle circle = new Circle(5);

        // Выводим радиус окружности
        System.out.println("Радиус окружности: " + circle.getRadius());

        // Вычисляем и выводим площадь окружности
        System.out.println("Площадь окружности: " + circle.calculateArea());

        // Вычисляем и выводим длину окружности
        System.out.println("Длина окружности: " + circle.calculateCircumference());

        // Изменяем радиус окружности
        circle.setRadius(8);

        // Выводим обновленный радиус окружности
        System.out.println("Обновленный радиус окружности: " + circle.getRadius());

        // Вычисляем и выводим обновленную площадь окружности
        System.out.println("Обновленная площадь окружности: " + circle.calculateArea());

        // Вычисляем и выводим обновленную длину окружности
        System.out.println("Обновленная длина окружности: " + circle.calculateCircumference());
    }
}
