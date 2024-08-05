import java.lang.*;
class DemoStatic
{
	static int i=10;
	static String name="vamsi";
 
}
class StaticCall
{
	public static void main(String args[])
	{
		System.out.println("Static variables : "+DemoStatic.i+"   "+DemoStatic.name);
				
	}
}