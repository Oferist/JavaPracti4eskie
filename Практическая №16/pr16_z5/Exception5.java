package pr16_z5;

public class Exception5 {
	public static void main(String[] args) {
		getDetails(null);
	}
	
	public static void getDetails(String key) {
	    try {
	      if(key == null) {
	        throw new NullPointerException("null key in getDetails");
	      }
	      // do something with the key
	    } catch (NullPointerException e) {
	      // handle the exception
	      System.out.println(e.getMessage());
	    }
	}
}
