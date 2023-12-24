package pr3;

public class TestBall {
    public static void main(String[] args) {
        // Создаем объект класса Ball с использованием разных конструкторов
        Ball ball1 = new Ball(3.0, 4.0);
        Ball ball2 = new Ball();

        // Выводим начальные координаты мячей
        System.out.println("Первый мяч: " + ball1);
        System.out.println("Второй мяч: " + ball2);

        // Перемещаем мячи
        ball1.move(1.5, 2.5);
        ball2.move(-0.5, 1.0);

        // Выводим координаты мячей после перемещения
        System.out.println("Первый мяч после перемещения: " + ball1);
        System.out.println("Второй мяч после перемещения: " + ball2);
    }
}
