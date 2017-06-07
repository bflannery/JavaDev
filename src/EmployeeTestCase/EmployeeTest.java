package EmployeeTestCase;

import java.io.*;

public class EmployeeTest {
	public static void main(String args[]) {
		Employee empOne = new Employee("Brian Flannery");
		Employee empTwo = new Employee("Sophie Lammers");
		
		empOne.empAge(26);
		empOne.empDesignation("Senior Software Engineer");
		empOne.empSalary(1000);
		empOne.printEmployee();
		
		empTwo.empAge(21);
		empTwo.empDesignation("Junior Software Engineer");
		empTwo. empSalary(500);
		empTwo.printEmployee();
	}
}
