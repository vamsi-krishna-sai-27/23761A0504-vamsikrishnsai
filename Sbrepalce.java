import java.lang.*;
import java.util.*;

class Sbrepalce
{
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("enter your name:");
		String n =scan.nextLine();
		StringBuffer name=new StringBuffer(n);
                System.out.println("enter  starting index : ");
		int startIndex=scan.nextInt();
		System.out.println("enter  ending index  : ");
		int endIndex=scan.nextInt();
		System.out.println("enter your name:");
		String name1 =scan.next();
		System.out.println("after : "+name.replace(startIndex,endIndex,name1));
	}

}