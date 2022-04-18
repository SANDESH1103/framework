package Sorting;

import java.util.Arrays;

public class InsertionSort {
	public static void main(String[] args) {
		int temp, j;
		int[] a = { 10,67,39, 290, 45, 20, 64, 39 };
		for (int i = 1; i < a.length; i++) {
			temp = a[i];
			j = i;
			while (j > 0 && a[j - 1] > temp) {
				a[j] = a[j - 1];
				j = j - 1;
			}
			a[j] = temp;
		}

		System.out.print(Arrays.toString(a));

	}
}
