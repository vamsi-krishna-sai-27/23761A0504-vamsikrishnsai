import java.lang.*;
import java.util.*;

class FacultyInfo
{
	public static void main(String args[])
	{
		Scanner f1=new Scanner(System.in);
		 Details d1=new Details();
		System.out.println("Faculty  id  : ");
		d1.id=f1.nextInt();
		f1.nextLine();
		System.out.println("Faculty name : ");
		d1.name=f1.nextLine();
		d1.printDetails();
		
	}
}

class Details
{
	 String name;
	 int id;
	void printDetails()
	{	
		System.out.println("Faculty Details ");
		System.out.println("Faculty name : "+name);
		System.out.println("Faculty  id  : "+id);
		
	}
 
}