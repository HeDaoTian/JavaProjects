package studentdatabaseapp;

import java.util.Scanner;

public class Student {
	private String firstName;
	private String lastName;
	private int gradeYear;
	private String studentId;
	private int counter = 1;
	private String courses = "";
	private int tuitionBalance = 0;
	private static int costOfCourse = 600;
	private static int id = 1000;
	
	
	public Student() {
		Scanner in = new Scanner(System.in);
		System.out.print("\nEnter student first name: ");
		this.firstName = in.nextLine();
		
		System.out.print("Enter student last name: ");
		this.lastName = in.nextLine();
		
		System.out.print("1 - Freshmen\n2 - Sophmore\n3 - Juior\n4 - Senior\nEnter student class level: ");
		this.gradeYear = in.nextInt();
		
		setStudentID();
		
		//System.out.println(firstName+" "+lastName+" "+gradeYear+" "+studentId);
	}
	
	//Generate ID
	private void setStudentID() {
		//Grade Level + ID
		id++;
		this.studentId = gradeYear + "" + id;
	}
	
	//Enroll courses
	public void enroll() {
		do {	
			System.out.print("Enter course to enroll (q to quit): ");
			Scanner in = new Scanner(System.in);
			String course = in.nextLine();
			if(!course.equals("q")) {
				courses = courses+"\n"+counter+") "+course;
				tuitionBalance += costOfCourse;
				counter++;
			}
			else {break;}
		}while(1==1);
	}
	
	//view balance
	public void viewBalance() {
		System.out.println("Your balance is: $"+tuitionBalance);
	}
	
	//Pay tuition
	public void payTuition() {
		viewBalance();
		System.out.print("Enter your payment: $");
		Scanner in = new Scanner(System.in);
		int payment = in.nextInt();
		tuitionBalance = tuitionBalance - payment;
		System.out.println("Thank you for your payment of $"+payment);
		viewBalance();
		
	}
	
	public String toString() {
		return "\nName: "+firstName+" "+lastName+
				"\nGrade Level:"+gradeYear+
				"\nCourses Enrolled:"+courses + 
				"\nBalance: $"+tuitionBalance+
				"\nStudentID: "+studentId;
	}
}
