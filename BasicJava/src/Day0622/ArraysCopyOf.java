package Day0622;

import java.util.Arrays;

public class ArraysCopyOf {
	public static void main(String[] args) {
		int[] array = { 1, 2, 3, 4, 5 };
		int[] array1 = Arrays.copyOf(array, 3);

		for (int i : array1) {
			System.out.println(i + " ");
		}
	}

}
