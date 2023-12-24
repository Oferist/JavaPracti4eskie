package pr3;

public class TestAuthor {
    public static void main(String[] args) {
        // Создание объекта класса Author
        Author author = new Author("John Doe", "johndoe@example.com", 'M');
        
        // Вывод информации об авторе с использованием метода toString()
        System.out.println(author);
        
        // Изменение email автора
        author.setEmail("newemail@example.com");
        
        System.out.println(author);
        
        // Получение и вывод отдельных свойств автора с использованием геттеров
        System.out.println("Name: " + author.getName());
        System.out.println("Email: " + author.getEmail());
        System.out.println("Gender: " + author.getGender());
    }
}
