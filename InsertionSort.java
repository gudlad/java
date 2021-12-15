import java.util.Arrays;

public class InsertionSort {
	public static void Insertionsort(int a[]) {
		// run the steps n-1 times
		for (int i = 0; i < a.length - 1; i++) {

			for (int j = i + 1; j > 0; j--) {
				if (a[j] < a[j - 1]) {
					int temp = a[j];
					a[j] = a[j - 1];
					a[j - 1] = temp;
				} else {
					break;
				}
			}
		}
	}

	public static void main(String[] args) {

		int a[] = { 1, 2, 3, 4, 6, 7, 5 };
		Insertionsort(a);
		System.out.println(Arrays.toString(a));
	}
}
