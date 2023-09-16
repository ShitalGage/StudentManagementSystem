package com.AdmissionTest.test;

import java.util.Scanner;

import com.Admission.pojo.Admission;

public class AdmissionTest {
	public static void main(String args[]) {
		int count=0,choice=0;
		int studentId;
		int Admission;
Scanner s=new Scanner (System.in);
System.out.println("Enter the no. of Student you have to add");
int num=s.nextInt();
Admission b[]=new Admission[num];
do {
	System.out.println("1.Add Student Id\n 2.Update Student Details\n 3.Delete Student\n 4.Search Student\n 5.Available Course\n 6.Exit ");
	System.out.println("Enter Your Choice");
	choice=s.nextInt();
	switch(choice)
	{
	case 1:
		System.out.println("ADD STUDENT DETAILS");
		System.out.println("Enter the Student Id:");
		int Id=s.nextInt();
		System.out.println("Enter the Student Name:");
		String Name=s.next();
		System.out.println("Enter your Qualification:");
		String Qualify=s.next();
		System.out.println("Enter Your Contact no.:");
		String Contact=s.next();
		System.out.println("Enter your Email Id:");
		String email=s.next();
		break;
	case 2:
		System.out.println("Enter the Existing StudentId to update");
		studentId=s.nextInt();
		for(int i=0;i<=count;i++)
		{
			if(b[i]!=null && b[i].getStudentId()==studentId)
			{
				System.out.println("Enter the new Name to change");
				Name=s.next();
				b[i].setStudentName(Name);
				System.out.println("Enter the Qualification to change");
				Qualify=s.next();
				b[i].setStudentQualify(Qualify);
				System.out.println("Enter the contact no. to change");
				Contact=s.next();
				b[i].setStudentContactno(Contact);
				System.out.println("Enter the Email Id to change");
				email=s.next();
				b[i].setStudentEmails(email);
				System.out.println("Update is complete");
			}
		}
				break;
				case 3:
					System.out.println("Enter the Existing StudentId to delete");
					studentId=s.nextInt();
					for(int i=0;i<count;i++)
					{
						if(b[i]!=null && b[i].getStudentId()==studentId)
						{
					b[i]=null;
			System.out.println("Admission deleted successfully");
						}
					}
						break;
						case 4:
							System.out.println("Enter the existing StudentId to Search");
							studentId=s.nextInt();
							for(int i=0;i<count;i++)
							{
								if(b[i]!=null && b[i].getStudentId()==studentId);
								{
									System.out.println(b[i]);
								}
							}
							break;
						case 5:
							System.out.println("Thank you");
							System.exit(0);
							break;
							default:
								System.out.println("Invalid choice");
	}
}while(choice!=6);
}
}