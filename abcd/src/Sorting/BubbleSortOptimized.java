package Sorting;

import java.util.Arrays;

public class BubbleSortOptimized {
	public static void main(String[] args) {
		int a[] = { 15, 16, 6, 8, 5 };
		for (int i = 0; i < a.length-1 ; i++) {
			int flage = 0;
			for (int j = i + 1; j < a.length; j++) {
				if (a[i] > a[j]) {
					int temp = a[i];
					a[i] = a[j];
					a[j] = temp;
					flage = 1;
				}
			}
			if (flage == 0) {
				break;
			}
		}
		System.out.println(Arrays.toString(a));
	}

}
