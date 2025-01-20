package java_task6;

public class CircleClass {

	private double radius;
	private String color;
	
	//No argument
	public CircleClass(){
		this.radius= 2.0;
		this.color = "Red";
	} 
	
	//Two argument
	public CircleClass(double radius,String color) {
		this.radius = radius;
		this.color =color;
	}
	
	public double Calculatecircumference(){  //Method of circumference
		return 2* Math.PI*radius;
	}
	
	//Getter and Setter Method for radius and circumference (Encapsulation)
	public double getRadius() {
		return radius;
	}
	
	public String getColor() {
		return color;
	}
	
	public void setRadius(double radius) {
		this.radius = radius;
	}
	
	public void setColor(String color) {
		this.color = color;
	}
	
	//Method to display Radius and circumference
	public void displayCircleDetails() {
		System.out.println("Radius of Circle : " +radius);
		System.out.println("");
		System.out.println("Circumference of Circle : " +Calculatecircumference());
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CircleClass defaultCircle = new CircleClass();
		defaultCircle.displayCircleDetails();
		System.out.println();
		
		CircleClass customCircle = new CircleClass(3,"blue");
		customCircle.displayCircleDetails();

	}

}

/*
Output:
Radius of Circle : 2.0

Circumference of Circle : 12.566370614359172

Radius of Circle : 3.0

Circumference of Circle : 18.84955592153876
*/