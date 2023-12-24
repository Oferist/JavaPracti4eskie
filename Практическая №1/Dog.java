package pr1;

// Определение класса Собака
class Dog {
    private String name;
    private int age;

    // Конструктор класса
    public Dog(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Метод для того, чтобы собака лаяла
    public void bark() {
        System.out.println(name + " лает!");
    }

    // Метод для имитации игры собаки
    public void play() {
        System.out.println(name + " играет.");
    }

    // Метод toString() для представления объекта в виде строки
    @Override
    public String toString() {
        return "Собака: " + name + ", возраст: " + age + " лет";
    }

    public static void main(String[] args) {
        // Создание объекта Собака
        Dog myDog = new Dog("Рекс", 3);

        // Вызов методов на объекте собаки
        myDog.bark();
        myDog.play();

        // Вывод информации о собаке с использованием toString()
        System.out.println(myDog.toString());
    }
}
