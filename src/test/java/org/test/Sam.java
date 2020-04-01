package org.test;

import java.util.Scanner;

public class Sam {
	
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("pls enter id");
	
	int empId=sc.nextInt();
	System.out.println("employee id is" +empId);
	
	System.out.println("enter name ");
	String empName=sc.next();
	System.out.println("employee name is" +empName);
	
	
	 System.out.println("enter phonno.");
	long empPhoneno=sc.nextLong();
	 System.out.println("employee phoneno: is" +empPhoneno);
	 
	 System.out.println("enter salary");
	 float empSalary=sc.nextFloat();
	 System.out.println("employee salary is" +empSalary);
	 
	 System.out.println("enter gender ");
	String empGender=sc.next();
	 System.out.println("employee gender is" +empGender);
	 
	 System.out.println("enter city ");
	 String empCity=sc.next();
	 System.out.println("employee city is" +empCity);
}
}







