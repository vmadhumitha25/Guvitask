package guviclass;
import java.util.Scanner;

public class loops {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Simple if else loop
		Scanner obj =new Scanner(System.in);
		
		System.out.print("Enter the age: ");
		int age =obj.nextInt();
		if(age>60) {  //validate a condition use if 
			System.out.println("Iam an senior citizen");	
		} else {
			System.out.println("Iam still young");
		}	
		
		//Nested if else loop
		System.out.println("Enter the time: ");
		int time =obj.nextInt();
		if(time<12) {            
			 System.out.println("Good Morning");
		 }
		 else if (time<13) {
			 System.out.println("Good Afternoon");
		 }
		 else {
			 System.out.println("Good Evening");
		 }
		
		//Switch: lot many condition to check depending on one value, use switch statement
		System.out.println("Enter the day: ");
		int day =obj.nextInt();
		//String day = "Monday";
		switch(day) {
		case 1:
			System.out.println("Monday");
			break;
		case 2:
			System.out.println("Tuesday");
			break;
		case 3:
			System.out.println("Wednesday");
			break;
		case 4:
			System.out.println("Thursday");
			break;
		default:  //if none of the condition satisfied use default
			System.out.println("Have a good day");
		}
	}
}
