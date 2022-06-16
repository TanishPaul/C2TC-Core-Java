package tns;

import java.util.Scanner;

public class UserDefinedExc {

	public static void main(String[] args) {
		int age;
		System.out.println("Enter the Age");
		Scanner s=new Scanner(System.in);
		age=s.nextInt ();
		
		if(age<18)
		{
			throw new CantVote("you cannot cast vote");
		}
		{
			System.out.println("You can vote");
		}

	}

}
class CantVote extends RuntimeException
{
	public CantVote(String msg) {
		super(msg);
	}
}
	

