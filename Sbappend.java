import java.lang.*;
import java.util.*;

class Sbappend
{
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("enter your name:");
		String n =scan.nextLine();
		StringBuffer name=new StringBuffer(n);
		System.out.println(name.append("oops"));
		
		
	
	}

}