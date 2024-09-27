import java.lang.*;
import java.util.*;

class Scompare
{
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("enter your name:");
		String name=scan.nextLine();
		System.out.println("enter your name1:");
		String name1=scan.nextLine();
		System.out.println("compare : "+name.compareTo(name1));
		System.out.println("compareToIgnoreCase : "+name.compareToIgnoreCase(name1));
		
	
	}

}