package pr1;

// Определение класса "Книга"
class Book {
    private String title;
    private String author;
    private int year;

    // Конструктор класса
    public Book(String title, String author, int year) {
        this.title = title;
        this.author = author;
        this.year = year;
    }

    // Метод для получения названия книги
    public String getTitle() {
        return title;
    }

    // Метод для получения автора книги
    public String getAuthor() {
        return author;
    }

    // Метод для получения года издания книги
    public int getYear() {
        return year;
    }

    // Переопределение метода toString() для вывода информации о книге
    @Override
    public String toString() {
        return "Книга: " + title + ", Автор: " + author + ", Год издания: " + year;
    }

    public static void main(String[] args) {
        // Создание объекта класса "Книга"
        Book book = new Book("Java Programming", "John Smith", 2023);

        // Вывод информации о книге с использованием метода toString()
        System.out.println(book.toString());

        // Можно также получить информацию о книге, обращаясь к методам класса
        System.out.println("Название: " + book.getTitle());
        System.out.println("Автор: " + book.getAuthor());
        System.out.println("Год издания: " + book.getYear());
    }
}
