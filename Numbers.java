import java.util.Scanner;

/**
 * This class contains the dynamically allocated array and it's processing
 * Student Name: Jed Tabrilla Student Number: 040952093 Course: CST8130 - Data
 * Structures
 * 
 * @author Linda Crane
 * @author Melissa Sienkiewicz
 *
 */

public class Numbers {
	/**
	 * Stores Float values.
	 */
	private Float[] num;

	/**
	 * Store the number of items currently in the array.
	 */
	private int numItems;

	/**
	 * Default Constructor
	 */
	public Numbers() {

		num = new Float[10];// To initialize the default size of the array
		numItems = 0;
	}

	/**
	 * Constructor that initializes the numbers array.
	 * 
	 * @param initSize - user to set the maximum size of the array.
	 */
	public Numbers(int initSize) {

		num = new Float[initSize];
		numItems = 0;
		if (initSize <= 0) {
			System.out.println("You have inputed an invalid value, please try again!"); // If the value was not a
																						// integer

		}
	}

	/**
	 * Adds a value in the array
	 * 
	 * @param keyboard - Scanner object to use for input
	 */
	public void addValue(Scanner keyboard) {
		// TODO Write code here to add the values in the array
		System.out.println("Enter number : ");
		float value = keyboard.nextFloat();
		for (int i = this.numItems; i < num.length;) {
			num[i] = value;
			numItems++;

			break;

		}

	}

	/**
	 * Purpose: To calculate the average of all the values from the array
	 * 
	 * @return float value that represents the average
	 */
	public float calcAverage() {
		// calculates average
		Float sum = 0.0f;
		Float avg = 0.0f;
		for (int i = 0; i < numItems; i++) {
			sum = sum + num[i];
			avg = sum / numItems;
			if (num[i] == null) {
				avg = 0.00f;

			}
		}

		// return average value from values of the array ;
		return (float) avg;

	}

	@Override
	public String toString() {
		// TODO Write code for an appropriate toString method
		for (int i = 0; i < num.length; i++) {
			if (num[i] != null) {
				System.out.println(num[i]);
			}
		}
		return " ";
	}
}
