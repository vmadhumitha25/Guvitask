package java_task7;

import java.util.Scanner;

public class ArithmeticException1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner objS = new Scanner(System.in);
		try {
		System.out.print("Enter the First Integer : " );
		int num1 = objS.nextInt();
		System.out.print("Enter the Seccond Integer: ");
		int num2 = objS.nextInt();
		
		int result = num1/num2;
		System.out.println("Division Result : " +result);
		}
		catch(ArithmeticException e) {
			System.out.println("Error: Can't divide by zero");
		}
		finally {
			objS.close();
		}

	}

}
