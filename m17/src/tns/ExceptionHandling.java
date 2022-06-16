package tns;

public class ExceptionHandling {

	public static void main(String[] args) {
		int [] arr=new int [4];
		try
		{
			System.out.println(arr[4]);
			
			System.out.println("Inside try block");
		}
		catch (ArrayIndexOutofBoundsException ex) {
			System.out.println("Inside Catch Block");
			
		}
		finally
		{
			System.out.println("Inside finally block");
			
		}
		System.out.println("Outside try catch finally block...Rest of the code");
	}

}
