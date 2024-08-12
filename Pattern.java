import java.lang.*;
class Pattern
{
	public static void main(String a[])
	{
		 int val = Integer.parseInt(a[0]);
		for(int i=1;i<=val;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print("* ");
			}
			System.out.println(" ");
		}
	}
}