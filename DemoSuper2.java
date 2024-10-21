class DemoSuperConstructor
{
	DemoSuperConstructor()
	{
		System.out.println("first super class");
	}
	DemoSuperConstructor(int x)
	{
		System.out.println("second super class");
	}
}
class DemoSuperConstructor1 extends DemoSuperConstructor
{
	DemoSuperConstructor1()
	{
		super(2);
		System.out.println("sub class");
		DemoSuperConstructor demo1=new DemoSuperConstructor();	
	}
	
}
class DemoSuper2
{
	public static void main(String[] args)
	{
		DemoSuperConstructor1 demo=new DemoSuperConstructor1();
		
	}
}