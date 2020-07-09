import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class StringDemo {
//public static void main(String[] args) {
//	String s1="shubhaam";
//	String s2="dandare";
//	String str=String.format("my name is :%1$s,%2$s "
//			+ "",s1,s2);
//	System.out.println(str);
//}
public void save(String s1) {
	Map<Character, Integer> map=new HashMap<Character, Integer>();
	char[] chars=s1.toCharArray();
	for(Character ch:chars) {
		if(map.containsKey(ch)) {
			map.put(ch, map.get(ch)+1);
		}else
			map.put(ch, 1);
}

	Set<Character> keys=map.keySet();
	for(Character ch:keys) {
		if (map.get(ch)>1) {
			System.out.println("char"+" "+ch+" "+map.get(ch));
		}
	}
}
public static void main(String[] args) {
	StringDemo sd=new StringDemo();
	sd.save("shubhamsingh");
}
}
