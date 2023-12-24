package pr16_z6;

public class ThrowsDemo {
	public static void main(String[] args) {
		try {
			printMessage(null);
		} catch (NullPointerException e) {
			System.out.println(e.getMessage());
		}
	}
	public static void printMessage(String key) {
		String message = getDetails(key); 
		System.out.println(message);
	}
	public static String getDetails(String key) {
		if(key == null) {
			throw new NullPointerException( "null key in getDetails" );
		}
		return "data for " + key; 
	}
}
