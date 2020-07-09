import java.sql.Savepoint;

public class StringDemo {

//	
//	public String save(String s1,String s2) {
//		String s3= new StringBuffer((s1)).append(s2).toString();
//		return s3;
//	}
	
	
	
	
	
	
	
 	
	
	public static void main(String[] args) {
		StringDemo s=new StringDemo();
	
	String s1="dandare";
	String s2="shu";
s1=s1+s2;
s1=s1.substring(s2.length());
s2=s1.substring(0,s1.length()-s2.length());
//String str=s.save(s1, s2);
   
	System.out.println(s1+" "+s2);
}
}
