package com.greatlearning.app;

import java.util.Scanner;

import com.greatlearning.model.Employee;
import com.greatlearning.servicves.EmpCredentialsImpl;

public class Driver {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		System.out.println("please enter the first name");
		String f = in.next();
		System.out.println("pleaese enter the last name");
		String l = in.next();

		Employee emp1 = new Employee(f, l);

		EmpCredentialsImpl cred = new EmpCredentialsImpl();
		System.out.println("1.Admin");
		System.out.println("2.TECH");
		System.out.println("3.HR");
		System.out.println("4.Legal");
		System.out.println("please enter your Dept");
		int choice = in.nextInt();
		
		String genEmail = "";
		String genPassword = "";

		switch (choice) {
		case 1:
			genEmail = cred.generateEmailId(emp1.getFname().toLowerCase(), emp1.getLname().toLowerCase(), "admin");
			break;

		case 2:
			genEmail = cred.generateEmailId(emp1.getFname().toLowerCase(), emp1.getLname().toLowerCase(), "tech");
			break;

		case 3:
			genEmail = cred.generateEmailId(emp1.getFname().toLowerCase(), emp1.getLname().toLowerCase(), "hr");
			break;

		case 4:
			genEmail = cred.generateEmailId(emp1.getFname().toLowerCase(), emp1.getLname().toLowerCase(), "legal");
			break;

		default:
			System.out.println("please enter valid input");
		}

		genPassword = cred.password();

		emp1.setEmailId(genEmail);
		emp1.setPassword(genPassword);

		cred.showDetails(emp1);
	}

}
