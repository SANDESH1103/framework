package array;

import java.util.Arrays;

public class P7 {
	public static void main(String[] args) {
		int a[] = { 10, 20, 30, 40, 50, 60 };
		// op 60,10,50,20,40,30
		for (int i = a.length - 1; i > 0; i--) {
			int temp = a[i];
			int j=0;
			//for (int j = 0; j < a.length - 1; j++) {
				if (a[i]> a[j]) {
				
					a[i] = a[j];
					a[j] = temp;
					j++;
					//break;
				}
				//a[j]=temp;
		}
		System.out.println(Arrays.toString(a));
	}
}
