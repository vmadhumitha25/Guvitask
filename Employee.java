package java_task6;

public class Employee {

	//Attributes
	private int id;
	private String firstname;
	private String lastname;
	private int salary;

	//Constructor creation
	public Employee(int id, String firstname, String lastname, int salary) {
		this.id = id;
		this.firstname = firstname;
		this.lastname = lastname;
		this.salary = salary;
	}
	
	//Getter method for attribute
	public int getId() {
		return id;
	}
	public String getFirstname() {
		return firstname;
	}
	public String getLastname() {
		return lastname;
	}
	public String getName() {
		return firstname + " " +lastname;
	}
	public int getSalary() {
		return salary;
	}
	
	//Setter method for attribute

	public void setSalary(int salary) {
		this.salary = salary;
	}
	public int getAnnualSalary() {
		return salary*12;
	}
	
	//Raise the salary
	public int raiseSalary(int percent) {
		double raiseAmount = salary * (percent/100.00);
		salary += raiseAmount;
		return salary;
	}
	
	public String toString() {
		return "Employee[id= " + id + "name= " + getName() +"salary= " + salary +"]";
	}
	
}
