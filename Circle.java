import java.lang.*;
import java.util.*;
class Circle
{
	public static void main(String args[] )
	{
		Scanner o1=new Scanner(System.in);
		OutPut a=new OutPut();
		System.out.println("enter the radius of the circle :");
		a.r=o1.nextInt();
	
		a.result();
	
	}
	
}
	
class OutPut
{
	int r;
	final double PI=3.14;
	double res;
	void result()
	{	
		res=4*PI*r*r;
		System.out.println("answer is :"+res);
	}
}