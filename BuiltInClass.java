import java.lang.*;
class BuiltInClass
{
	public static void main(String args[])throws InterruptedException
	{
		int a =5;
		int b=10;
		int x=Math.addExact(a,b);
		System.out.println(x);
		int y=Math.subtractExact(a,b);
		Thread.sleep(1000);
		System.out.println(y);
	} 
}