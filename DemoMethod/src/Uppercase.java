
public class Uppercase {
	/*
	 * public static void main(String[] args) { String str1= "pratik"; String
	 * String str1= "pratik"; StringBuffer sb =new StringBuffer();
	 * sb.append(str1.toUpperCase()).append(str2.toUpperCase());
	 * 
	 * System.out.println(sb); }
	 */
   public String upper(String s1,String s2) {
	   
	   String s3= s1.concat(s2);
	
	   return s3;
   }


public static void main(String[] args) {
    Uppercase u=new Uppercase();
    String s1="prAtiK ";
    String s2="DanDare";
   String A= u.upper(s1,s2);
   System.out.println(A.toLowerCase());
}
}
