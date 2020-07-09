
public class CountingString {
	public static void main(String[] args) {

		String str = "java";
		int vcount = 0;
		int Ccount = 0;
		str = str.toLowerCase();
		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
				vcount++;
			} else if ((ch >= 'a' && ch <= 'z')) {
				Ccount++;

			}

		}

		System.out.println(vcount);
		System.out.println(Ccount);
	}
}
