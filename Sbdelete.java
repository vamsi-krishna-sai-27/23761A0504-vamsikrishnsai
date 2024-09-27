import java.lang.*;
import java.util.*;

class Sbdelete
{
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("enter your name:");
		String n =scan.nextLine();
		StringBuffer name=new StringBuffer(n);
		System.out.println("enter  starting index to delete : ");
		int startIndex=scan.nextInt();
		System.out.println("enter  ending index to delete : ");
		int endIndex=scan.nextInt();
		System.out.println("after : "+name.delete(startIndex,endIndex));
	}

}