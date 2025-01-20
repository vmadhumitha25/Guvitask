package java_task6;

public class Person {

	private String name;
	private int age;
	
	public Person(String name,int age) {  //Creating a constructor
		this.name = name;
		this.age = age;
	}
	
	//Getter method for name and age
	
	public String getName() {
		return name;
	}
	
	public int getAge() {
		return age;
	}
	
	//Setter method for name and age
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void setAge(int Age) {
		this.age = age;
	}
	public static void main(String[] args) {
		/*Person person = new Person("Madhu",24);
		System.out.println("Name: " +person.getName());
		System.out.println("Age: " +person.getAge());
		*/
		
		//For getter and setter method
		Person person = new Person("Madhu", 24);
		person.setName("Madhu Mitha");
		person.setAge(24);
		
		System.out.println(person.getName());
		System.out.println(person.getAge());
	}
	
}
