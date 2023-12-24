package z1_pr9;

//Класс, представляющий машину
public class Car implements Nameable {
	private String name;
	
	public Car(String name) {
		this.name = name;
	}
	
	@Override
	public String getName() {
		return name;
	}
}
