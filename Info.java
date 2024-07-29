import java.lang.*;
import java.util.*;
class Info
{
	public static void main(String args[])
	{
		Scanner s1=new Scanner(System.in);
		Student details=new Student();

		//reading student deatils
 
		System.out.println("roll number : ");
		details.roll=s1.nextInt();
		s1.nextLine();
		System.out.println("name : ");
		details.name=s1.nextLine();
		System.out.println("cgpa : ");
		details.cgpa=s1.nextDouble();

		//reading another student deatils
 
		System.out.println("\tenter another student details : ");
		Scanner s2=new Scanner(System.in);
		Student details2=new Student();
		System.out.println("roll number : ");
		details2.roll=s2.nextInt();
		s2.nextLine();
		System.out.println("name : ");
		details2.name=s2.nextLine();
		System.out.println("cgpa : ");
		details2.cgpa=s2.nextDouble();

		//display student details

		details.displayText();
		details2.displayText();
	}
}
class Student
{
	int roll;
	double cgpa;
	String name;
	void displayText()
	{
		System.out.println("/tstudent Details ");
		System.out.println("name : "+name);
		System.out.println("roll number : "+roll);
		System.out.println("cgpa : "+cgpa);
	}
}

