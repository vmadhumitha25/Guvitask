package java_task7;

import java.util.ArrayList;

public class Arraylist {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<String> As = new ArrayList<String>();
		
		As.add("Fruits");
		As.add("Vegetables");
		As.add("Grocery");
		As.add("Medicines");
		As.add("Nuts");
		
		int size = As.size();
		System.out.println(size);
		
		System.out.println("Arraylist : " +As);
		
		As.remove(2);
		System.out.println("Removed Index 2 : " +As);
		
		As.removeAll(As);
		System.out.println("Removed all the items from Array List : " +As);
		
		int size2 = As.size();
		System.out.println(size2);
	}

}
