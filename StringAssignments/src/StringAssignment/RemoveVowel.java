package StringAssignment;

public class RemoveVowel {

	public static void main(String[] args) {

		String str1 = "shubhamshubham";

		// String str1=str.toLowerCase();

		char[] c = str1.toCharArray();

		String s = "";

		for (int i = 0; i < c.length; i++) {

			if (c[i] != 'a' && c[i] != 'e' && c[i] != 'i' && c[i] != 'o' && c[i] != 'u') {
				s = s + c[i];
			}

		}
		System.out.println("removing vowels : " + s);
	}

}
