import java.lang.*;
import java.util.*;

class Scase
{
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("enter your name:");
		String name=scan.nextLine();
		System.out.println("lower case : "+name.toLowerCase());
		System.out.println("upper case : "+name.toUpperCase());
	
	}

}