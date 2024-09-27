import java.lang.*;
import java.util.*;

class Sbcapacity
{
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("enter your name:");
		String n =scan.nextLine();
		StringBuffer name=new StringBuffer(n);
		System.out.println("enter  starting value of the index to delete : ")';
		int startIndex=scan.nextInt();
		System.out.println("enter  ending  value of the index to delete : ")';
		int end Index=scan.nextInt();
		System.out.println("after : "+name.delete(startIndex,endIndex));
		
		
	
	}

}