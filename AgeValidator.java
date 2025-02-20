package java_task7;

public class AgeValidator {
	 
	    public static void checkAge(int age) throws InvalidAgeException {
	        if (age < 18) {
	            throw new InvalidAgeException("Age must be 18 or above. Entered age: " + age);
	        } else {
	            System.out.println("Access granted. Your age is " + age);
	        }
	    }
	    
	    public static void main(String[] args) {
	        java.util.Scanner scanner = new java.util.Scanner(System.in);
	        
	        System.out.print("Enter your age: ");
	        int age = scanner.nextInt();
	        
	        try {
	            checkAge(age);
	        } catch (InvalidAgeException e) {
	            System.out.println("Exception caught: " + e.getMessage());
	        } finally {
	            scanner.close();
	        }
	    }
	
}


