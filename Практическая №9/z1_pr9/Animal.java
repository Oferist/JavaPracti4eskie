package z1_pr9;

// Класс, представляющий животное
public class Animal implements Nameable {
	private String name;
	
	public Animal(String name) {
		this.name = name;
	}
	
	@Override
	public String getName() {
		return name;
	}
}
