import java.lang.*;
class DemoStatic
{
	static int i=4;
	static String name="vamsi";

	void display()
	{
		System.out.println("Static variables : "+DemoStatic.i+"   "+DemoStatic.name);
	}
 
}
class CallStatic
{
	public static void main(String args[])
	{
		DemoStatic x=new DemoStatic();
		x.display();	
	}
}