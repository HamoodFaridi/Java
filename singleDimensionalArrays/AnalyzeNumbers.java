package singleDimensionalArrays;

import java.util.Scanner;

public class AnalyzeNumbers {
	/*
	 * Prompt user to enter number of items for array. 
	 * Get the avarage of the items and also display count of items 
	 * having value greater than the average.
	*/

	public static void main(String[] args) {
		try(Scanner input = new Scanner(System.in)) {
			System.out.println("Enter the number of items");
			int n = input.nextInt();
			double[] numbers = new double[n];
			System.out.println("Enter the numbers");
			double total = 0;
			for (int i = 0; i < numbers.length; i++) {
				numbers[i] = input.nextDouble();
				total += numbers[i];
			}
			double average = total / numbers.length;
			int count = itemsCountGreaterThanAverage(numbers, average);
			System.out.println("Average of numbers is " + average);
			System.out.println("Numebr of elements greater than the average value is " + count);
		}
		
    }
	
	public static int itemsCountGreaterThanAverage(double[] numbers, double average) {
		int cnt = 0;
		for (int i = 0; i < numbers.length; i++) {
			if (numbers[i] > average) cnt++;
		}
		return cnt;	
	}
}
