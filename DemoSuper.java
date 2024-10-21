class DemoSupervarible
{
	int speed=100;
}

class DemoSupervarible1 extends DemoSupervarible
{
	int speed=200;
	void display()
	{
		System.out.println("speed ="+super.speed);
	}
}

class DemoSuper
{
	public static void main(String[] args)
	{
		DemoSupervarible1 demo=new DemoSupervarible1();
		demo.display();
	}
}