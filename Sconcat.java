import java.lang.*;
import java.util.*;

class Sconcat
{
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("enter your name:");
		String name=scan.nextLine();
		System.out.println("enter your last name: ");
		String lname= scan.next();
		
		System.out.println(name.concat(lname));
	}

}