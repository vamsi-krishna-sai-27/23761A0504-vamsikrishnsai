import java.lang.*;
import java.util.*;
class Student
{
	final static String college_name="LBRCE";
	final static String state="AP";
	final static int pincode=123456;
	 String name;
	 int roll;
	 float cgpa;
	 String branch;
	 String gender; 
	void display()
	{	
		System.out.println(" ");
		System.out.println("student details:");
		System.out.println("name:\t \t"+name);
		System.out.println("roll number:\t"+roll);
		System.out.println("cgpa: \t\t"+cgpa);
		System.out.println("branch: \t"+branch);
		System.out.println("gender: \t "+gender);
		System.out.println("college name :\t"+college_name);
		System.out.println("state :\t\t"+state);
		System.out.println("pin code :\t"+pincode);
		System.out.println(" ");
		


	}
	
}
class AutomationStudentDetails
{
	public static void main(String args[])
	{
		Student det1=new Student();
		Scanner scan=new Scanner(System.in);
		System.out.println("enter your name: ");
		det1.name =scan.nextLine();
		System.out.println("enter your roll: ");
		det1.roll=scan.nextInt();
		System.out.println("enter your cgpa: ");
		det1.cgpa=scan.nextFloat();
		scan.nextLine();
		System.out.println("enter your branch: ");
		det1.branch=scan.nextLine();
		System.out.println("enter your gender: ");
		det1.gender=scan.nextLine();

		Student det=new Student();
		Scanner scan1=new Scanner(System.in);
		System.out.println("enter your name: ");
		det.name =scan1.nextLine();
		System.out.println("enter your roll: ");
		det.roll=scan1.nextInt();
		System.out.println("enter your cgpa: ");
		det.cgpa=scan1.nextFloat();
		scan1.nextLine();
		System.out.println("enter your branch: ");
		det.branch=scan1.nextLine();
		System.out.println("enter your gender: ");
		det.gender=scan1.nextLine();


		det.display();
		det1.display();

	}
}