package singleDimensionalArrays;

import methods.RandomCharacter;

public class CountLettersInArray {
	/* Randomly generate 100 characters in lower case format.
	 * Get a count of each character display the result.
	 * Use 2 separate methods. 1. Generate random characters. 2. Get the count of each character in array.
	*/
	public static void main(String[] args) {
		// Declare and create array of random lower case characters
		char[] chars = createArray();
		
		// Display the lower case characters
		System.out.println("The lower case characters in the array are: ");
		displayCharacters(chars);
		
		int[] counts = countLetters(chars);
		displayCounts(counts);
		
	}
	
	/** Create an array of 100 randomly generated lower case characters */
	public static char[] createArray() {
		char[] randomCharacters = new char[100];
		
		// Generate lower case characters randomly and assign them to array
		for (int i = 0; i < randomCharacters.length; i++) {
			randomCharacters[i] = RandomCharacter.getRandomLowerCaseLetter(); // Using RandomCharacter method from methods package
		}
		return randomCharacters;
	}
	
	/** Method to display randomly generated characters with 20 chars in each line*/
	public static void displayCharacters(char[] characters) {
		for (int i = 0; i < characters.length; i++) {
			if ((i+ 1) % 20 == 0) {
				System.out.println(characters[i]);
			}
			else {
				System.out.print(characters[i] + " ");
			}
		}
	}
	
	/** Method to count occurrence of character*/
	
	public static int[] countLetters(char[] characters) {
		int[] count = new int[26];
		for (char e: characters) {
			count[e - 'a']++;
		}
		return count;
	}
	
	/** Method to display the counts*/
	
	public static void displayCounts(int[] counts) {
		for(int i = 0; i < counts.length; i++) {
			if((i + 1) % 10 == 0) {
				System.out.println((char) (i + 'a') + ":" + counts[i]);
			}
			else {
				System.out.print((char) (i + 'a') + ":" + counts[i] + " ");
			}
		}
	}
}
