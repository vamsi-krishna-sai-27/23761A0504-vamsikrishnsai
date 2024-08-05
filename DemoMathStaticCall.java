import java.lang.*;
import java.util.*;
class DemoMath1
{
	static int DemoAdd(int x,int y)
	{
		return x+y;	
	}
	static int DemoMult(int x,int y)
	{
		return x*y;
	}

	void display(int x,int y)
	{
		System.out.println("Add :"+DemoMath1.DemoAdd(x,y));
		System.out.println("Mult :"+DemoMath1.DemoMult(x,y));
	}
}
class DemoMathStaticCall
{
	public static void main (String args[])
	{
		Scanner scan =new Scanner(System.in);
		System.out.println("enter a number X:");
		int x=scan.nextInt();
		System.out.println("enter a number Y:");
		int y=scan.nextInt();
		DemoMath1 call=new  DemoMath1();
		call.display(x,y);
				
	}
}