class DemoSupermethod
{
	void message()
	{
		System.out.println("super speed ");
	}
}

class DemoSupermethod1 extends DemoSupermethod
{
	void message()
	{
		System.out.println("speed ");
	}
	void display()
	{
		super.message();
		message();
	}
}

class DemoSuper1
{
	public static void main(String[] args)
	{
		DemoSupermethod1 demo=new DemoSupermethod1();
		demo.display();
	}
}