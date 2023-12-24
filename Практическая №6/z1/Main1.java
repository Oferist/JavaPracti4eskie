package z1;

public class Main1 {
    public static void main(String[] args) {
        // Создаем объекты тарелки и кружки
        Plate plate = new Plate("Керамика", 20, true);
        Mug mug = new Mug("Стекло", 10, "Белый");

        // Выводим информацию о посуде
        plate.displayInfo();
        mug.displayInfo();
    }
}
