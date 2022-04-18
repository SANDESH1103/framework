package Sorting;

import java.util.Arrays;

public class InsertionSort1 {
	public static void main(String[] args) {
		int[] a = { 10, 67, 39, 290, 45, 20, 64, 39 };
		int temp, j;
		for (int i = 1; i < a.length; i++) {
			temp = a[i];
			j = i - 1;
			while (j >= 0 && a[j] > temp) {
				a[j + 1] = a[j];
				j--;

			}
			a[j + 1] = temp;
		}
		System.out.println(Arrays.toString(a));
	}

}
