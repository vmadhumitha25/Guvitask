package java_task7;

import java.util.ArrayList;

public class ListToArray {

	public static void main(String[] args) {
		ArrayList<String> vegetables = new ArrayList<>();

		// Add elements to ArrayList
		vegetables.add("Tomato");
		vegetables.add("Onion");
		vegetables.add("Raw Banana");
		vegetables.add("Carrot");
		vegetables.add("Beans");

		int s = vegetables.size();

		String[] arr = new String[s];

		// Convert list to array
		vegetables.toArray(arr);
		/// arr[5]="Ruby"; // Will give indexoutofboundexception

		for (String r : arr) {
			System.out.println(r);
		}

	}

}


/*
Output: 
Tomato
Onion
Raw Banana
Carrot
Beans

*/