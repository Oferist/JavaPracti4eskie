package pr4;

public class Book {
    private String author;
    private String title;
    private int year;

    // Конструктор для создания объекта книги с указанными свойствами
    public Book(String author, String title, int year) {
        this.author = author;
        this.title = title;
        this.year = year;
    }

    // Методы для получения свойств книги
    public String getAuthor() {
        return author;
    }

    public String getTitle() {
        return title;
    }

    public int getYear() {
        return year;
    }

    // Методы для изменения свойств книги
    public void setAuthor(String author) {
        this.author = author;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setYear(int year) {
        this.year = year;
    }
}

