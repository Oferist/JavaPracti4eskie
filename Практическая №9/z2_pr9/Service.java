package z2_pr9;

//Класс, представляющий услугу
public class Service implements Priceable {
	private String serviceName;
	private double hourlyRate;
	
	public Service(String serviceName, double hourlyRate) {
		this.serviceName = serviceName;
		this.hourlyRate = hourlyRate;
	}
	
	@Override
	public double getPrice() {
		return hourlyRate;
	}
}
