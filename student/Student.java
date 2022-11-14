package org.student;

import org.department.Department;

public class Student extends Department{
	
public void studname()
{
	System.out.println("Student name: Praveena");
}
public void studdept()
{
	System.out.println("Students Department: ComputerScience");
}
public void studid() {
	System.out.println("Students ID:  1234567");
}
	public static void main(String[] args) {
		
		Student stu =new Student();
		stu.studname();
		stu.studid();
		stu.studdept();
		stu.depart();
		stu.collegeName();
		stu.collegeCode();
		stu.collegeRank();
		
		
		
	}

}
