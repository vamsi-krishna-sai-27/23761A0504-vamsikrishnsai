import java.lang.*;
class DemoStatic
{
	static int i=10;
	char d='B';
	static String name="vamsi";
	boolean b=true;
 
}
class Call
{
	public static void main(String args[])
	{
		System.out.println("Static variables : "+DemoStatic.i+"   "+DemoStatic.name);
		DemoStatic x=new DemoStatic();
		System.out.println("non-Static variables : "+x.d+"   "+x.b);
		
	}
}