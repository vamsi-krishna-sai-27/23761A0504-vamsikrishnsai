import java.lang.*;
import java.util.*;

class Quadratic
{
	public static void main(String args[])
	{
		Scanner q1=new Scanner(System.in);
		Values r1= new Values();
		System.out.println("enter a value 'a' :");
		r1.a=q1.nextInt();
		System.out.println("enter a value 'b' :");
		r1.b=q1.nextInt();
		System.out.println("enter a value 'c' :");
		r1.c=q1.nextInt();
		r1.resultPrint();
		
		
		
	}	
}

class Values
{
	int a,b,c;
	double result;
	void resultPrint()
	{
		result=Math.sqrt((b*b)-4*a*c);
		System.out.println("result = "+result);
		if(result>0)
		{
			System.out.println("real and positive");
		}
		else
		{
			System.out.println("imaginer and negative");

		}
	}
}