package singleDimensionalArrays;

import java.util.Arrays;

public class SelectionSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double[] list = {1, 4, 6, 9, 8, 0, 12, 8, 19, 14, 13};
		double[] list1 = {1, 9, 4.5, 6.6, 5.7, -4.5};
		System.out.println(Arrays.toString(list));
		sorting(list);
		System.out.println(Arrays.toString(list));
//		sorting(list1);
		Arrays.sort(list1);
		System.out.println(Arrays.toString(list1));
	}
	
	public static void sorting(double[] list) {
		for(int i = 0; i < list.length - 1; i++) {
			double currentMinimum = list[i];
			int currentMinIndex = i;
			
			// Second loop starting 1 position ahead of ith value to check for minimum value
			for (int j = i + 1; j < list.length; j++) {
				if (list[j] < currentMinimum) {
					currentMinimum = list[j]; // store minimum value
					currentMinIndex = j; // get index of minimum value
				}
			}
			
			//	Swap list[i] with list[currentMinIndex] if necessary
			if (currentMinIndex != i) {
				list[currentMinIndex] = list[i];
				list[i] = currentMinimum;
			}
		}
	}
}
