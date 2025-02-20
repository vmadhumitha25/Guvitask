package java_task7;

public class StringOutOfBondException {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "Welcome to Guvi Task - 7";
		try {
		//System.out.println("Character at index 30 : " +str.charAt(50));
		 str.charAt(50);
		//String sub=str.substring(2,8);
		//System.out.println("Character at index 30 : " +str.substring(10,40));
		}
		catch(StringIndexOutOfBoundsException e) 
		{
			System.out.println("Error: String index is out of bounds.");
		}
	}

}
