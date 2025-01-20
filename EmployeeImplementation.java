package java_task6;

public class EmployeeImplementation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Employee employee = new Employee(1,"Madhu", "Mitha", 45000);
		System.out.println(employee);
		
		//Annual Salary
		int annualSalary = employee.getAnnualSalary();
		System.out.println("Annual Salary : " +annualSalary);
		
		//Raise Salary
		int raiseSalary = employee.raiseSalary(10);
		System.out.println("Raised Salary :" +raiseSalary);
	}

}

/*
Output:
Employee[id= 1name= Madhu Mithasalary= 45000]
Annual Salary : 540000
Raised Salary :49500
*/