import java.lang.*;

class rev
{
	public static void main(String args[])
	{
		int a=1234567890;
		int i;
		while(a!=0)
		{
			i=a%10;
			System.out.print(i);
			a=a/10;		
		}
	}
}
