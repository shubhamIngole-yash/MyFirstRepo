package ArrayAssignment;

import java.util.Arrays;

public class ThirdMaximumNum {

	public static void main(String[] args) {

		int[] a = { 1, 4, 66, 433, 45, 22, 44 };

		int temp = 0;

		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a.length; j++) {
				if (a[i] > a[j]) {
					temp = a[i];
					a[i] = a[j];
					a[j] = temp;

				}

			}

		}

		System.out.println(Arrays.toString(a));

		System.out.println("Third maximum number is: "+a[2]);

	}

}
