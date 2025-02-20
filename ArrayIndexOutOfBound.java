package java_task7;

public class ArrayIndexOutOfBound {
	public static void main(String[] args) {
		int[] numbers = { 1, 2, 3, 4, 5 }; // Array of size 5

		try {
			// Trying to access index 5, but valid indices are 0 to 4
			System.out.println("Accessing index 5: " + numbers[5]);
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Exception caught: " + e);
		}

		System.out.println("Program continues after handling the exception.");
	}
}
