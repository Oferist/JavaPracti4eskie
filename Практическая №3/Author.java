package pr3;

public class Author {
    private String name;
    private String email;
    private char gender;

    // Конструктор класса Author
    public Author(String name, String email, char gender) {
        this.name = name;
        this.email = email;
        this.gender = gender;
    }

    // Геттеры для полей
    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public char getGender() {
        return gender;
    }
    
    public void setEmail(String email) {
    	this.email = email;
    }
    
    @Override
    public String toString() {
        return "Author: " + name + "; Email: " + email + "; Gender: " + gender;
    }
}
