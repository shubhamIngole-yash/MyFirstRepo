package ArrayAssignment;

public class CountDuplicateArray {

	public static void main(String[] args) {

		int arr[] = { 4, 4, 5, 5, 6, 7, 87, 3, 45, 3, 5 };

		for (int i = 0; i < arr.length; i++) {
			int count = 1;
			for (int j = 0; j < arr.length; j++) {
				if (i == j) {
					break;
				}

				if (arr[i] == arr[j]) {
					count++;
				}

			}
			if(count>1)
			System.out.println(arr[i] + " " + count);
		}
	}

}
