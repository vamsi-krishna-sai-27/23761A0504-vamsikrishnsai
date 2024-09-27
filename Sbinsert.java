import java.lang.*;
import java.util.*;

class Sbinsert
{
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("enter your name:");
		String n =scan.nextLine();
		StringBuffer name=new StringBuffer(n);
		System.out.println("enter  index : ");
		int index=scan.nextInt();
		System.out.println("enter your name:");
		String name1 =scan.next();
		System.out.println(name.insert(index,name1));
		
		
	
	}

}