package singleDimensionalArrays;

public class VarArgsDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		printMax(34, 3, 3, 2, 56.5);
		printMax(new double[] {1, 3, 5, 7});
		printMax(new int[] {1, 2 ,34, 5});
	}
	
	public static void printMax(double... numbers) {
		if (numbers.length == 0) {
			System.out.println("No argument passed");
		}
		
		double max = numbers[0];
		for (int i = 1; i < numbers.length; i++) {
			if (numbers[i] > max) {
				max = numbers[i];
			}
		}
		System.out.println("max number is " + max);
	}
	
	public static void printMax(int... numbers) {
		if (numbers.length == 0) {
			System.out.println("No argument passed");
		}
		
		int max = numbers[0];
		for (int i = 1; i < numbers.length; i++) {
			if (numbers[i] > max) {
				max = numbers[i];
			}
		}
		System.out.println("max number is " + max);
	}

}
