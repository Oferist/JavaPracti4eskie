package pr4;

public class BookTest {
    public static void main(String[] args) {
        // Создаем объект книги
    	Book book = new Book("Джордж Оруэлл", "1984", 1949);

        // Выводим информацию о книге
        System.out.println("Автор: " + book.getAuthor());
        System.out.println("Название: " + book.getTitle());
        System.out.println("Год написания: " + book.getYear() + "\n");

        // Изменяем свойства книги
        book.setAuthor("Джон Смит");
        book.setTitle("Тайны Вселенной");
        book.setYear(2022);

        // Выводим обновленную информацию о книге
        System.out.println("Обновленный автор: " + book.getAuthor());
        System.out.println("Обновленное название: " + book.getTitle());
        System.out.println("Обновленный год написания: " + book.getYear());
    }
}
