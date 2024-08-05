import java.lang.*;
import java.util.*;
class DemoMath1
{
	static int DemoAdd(int x,int y)
	{
		return x+y;	
	}
	static int DemoSub(int x ,int y)
	{
		return x-y;
	}
	static int DemoMult(int x,int y)
	{
		return x*y;
	}
	static double DemoDiv(int x,int y)
	{
		return x/y;
	}
	static void display(int x,int y)
	{
		System.out.println("Add :"+DemoMath1.DemoAdd(x,y));
		System.out.println("Sub :"+DemoMath1.DemoSub(x,y));
		System.out.println("Mult :"+DemoMath1.DemoMult(x,y));
		System.out.println("Div:"+DemoMath1.DemoDiv(x,y));
	}
}
class DemoMathStatic
{
	public static void main (String args[])
	{
		Scanner scan =new Scanner(System.in);
		System.out.println("enter a number X:");
		int x=scan.nextInt();
		System.out.println("enter a number Y:");
		int y=scan.nextInt();
		DemoMath1.display(x,y);
				
	}
}