import java.lang.*;
class  CommandLineDemo3
{
	public static void main(String a[])
	{
		int fact=Integer.parseInt(a[0]);
		int i;
		int f =1 ;
		for(i=1;i<=fact;i++)	
		{
			f =f * i;
		}
		System.out.println("factorial :"+f);
	}

}