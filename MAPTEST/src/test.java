import java.util.HashMap;

public class test {

	public static void main(String[] args) {
		
		HashMap<String, Boolean> hm = new HashMap<String, Boolean>();
		hm.put("Pratik", false);
		hm.put("shubham", true);
		
		
		boolean containsKey = hm.containsKey("Pratik");
		Boolean boolean1 = hm.get("shubham");
		
		
		
		if(hm.containsKey("shubham") && hm.get("shubham"))
		{
			System.out.println("Login....");
		}
		else
		{
			System.err.println("not valid user...");
		}
			
		
		System.out.println(boolean1);
	}
	
}
