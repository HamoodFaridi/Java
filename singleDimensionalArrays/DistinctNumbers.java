package singleDimensionalArrays;

import java.util.Arrays;
import java.util.Scanner;


public class DistinctNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * Read a total of 10 numbers from user's input.
		 * Display the number of distinct numbers and the numbers in their input orders.
		*/
		
		try(Scanner input = new Scanner(System.in)) {
			
			// Prompt user to input 10 numbers
			System.out.println("Enter 10 numbers using a space of Enter key");
			int count = 0;
			int i = 0;
			boolean found = false;
			int[] numbers = new int[10];
			while (count < 10) {
				int number = input.nextInt();
				for (int e: numbers) {
					if (e == number) {
						found = true;
						break;
					}
				}
				if (found == false) {
					numbers[i] = number;
					i++;
				}
				count++;
				found = false;
			}
			System.out.println("The number of distinct numbers is " + i);
			System.out.print("The distint numbers are: ");
			for (int j = 0; j < i; j++) {
				System.out.print(numbers[j] + " ");
			}
		}

	}

}
