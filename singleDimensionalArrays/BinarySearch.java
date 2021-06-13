package singleDimensionalArrays;

public class BinarySearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] list = {2, 4, 7, 10, 11, 45, 50, 59, 60, 66, 69, 70, 79};
		int index = indexValue(list, 3);
		System.out.println(index);
	}
	
	public static int indexValue(int[] list, int key) {
		int low = 0;
		int high = list.length - 1;
		if (key < list[0] && key > list[list.length - 1]) {
			return -1;
		}
		
		
		while (high >= low) {
			int mid = (low + high) / 2;
			if (key < list[mid]) 
				high = mid - 1;
			else if (key == list[mid]) 
				return mid;
			else 
				low = mid + 1;
		}
		return -low - 1;
	}

}
