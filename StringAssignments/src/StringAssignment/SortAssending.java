package StringAssignment;

public class SortAssending {

	public static void main(String[] args) {

		String str = "shubham";

		char[] cs = str.toCharArray();
		char temp = 0;

		for (int i = 0; i < cs.length; i++) {
			for (int j = 0; j < cs.length; j++)

				if (cs[i] < cs[j]) {
					temp = cs[i];
					cs[i] = cs[j];
					cs[j] = temp;

				}

		}
		for (int i = 0; i < cs.length; i++) {
			System.out.print(cs[i]);

		}
	}

}
