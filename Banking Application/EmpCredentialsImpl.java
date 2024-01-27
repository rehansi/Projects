package com.greatlearning.servicves;

import java.util.Random;

import com.greatlearning.model.Employee;

public class EmpCredentialsImpl implements EmpCredentials {

	public String generateEmailId(String fname, String lname, String dept) {

		return fname + lname + "@" + dept + "gl.com";
	}

	public String password() {

		String caps = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		String lower = "abcdefghijklmnopqrstuvwxyz";
		String nums = "1234567890";
		String specialchars = "!@#$%^&*()";

		String combined = caps + lower + nums + specialchars;
		String pass = "";
		Random random = new Random();
		for (int i = 0; i < 8; i++) {
			pass = pass + String.valueOf(combined.charAt(random.nextInt(combined.length()))); // 72
		}
		return pass;
	}

	public void showDetails(Employee e) {

		System.out.println("employee first name is >" +e.getFname());
		System.out.println(("employee last name is >" +e.getLname()));
		System.out.println("employee mail is >" +e.getEmailId());
		System.out.println(("employee password is >" +e.getPassword()));

	}

}
