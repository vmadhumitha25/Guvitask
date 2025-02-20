package java_task7;

import java.util.Map;
import java.util.TreeMap;
import java.util.Map.Entry;

public class TreeMapEmployee {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		TreeMap<Integer, String> emp = new TreeMap<Integer, String>();
		
		emp.put(101, "Employee 01");
		emp.put(102, "Employee 02");
		emp.put(103, "Employee 03");
		emp.put(104, "Employee 04");
		emp.put(105, "Employee 05");
		
		System.out.println("Employee ID & Name : " +emp);
		
		// assertEquals("[1, 2, 3, 4, 5]", Emp.keySet().toString());
		
		/*Emp.entryset()
		.stream()
		.sorted(Map.Entry.comparingByValue())
		.forEach(entry->System.out.println("Employee ID :"  +entry.getkey() + " Employee Name :" + entry.getkey()));
		*/
		for(Entry<Integer,String> m:emp.entrySet()) {
            System.out.println("Name: " + m.getKey() + ", ID: " + m.getValue());
	}
	}
	
}

/*
 * Output:
 * Employee ID & Name : {101=Employee 01, 102=Employee 02, 103=Employee 03, 104=Employee 04, 105=Employee 05}
Name: 101, ID: Employee 01
Name: 102, ID: Employee 02
Name: 103, ID: Employee 03
Name: 104, ID: Employee 04
Name: 105, ID: Employee 05

 */
