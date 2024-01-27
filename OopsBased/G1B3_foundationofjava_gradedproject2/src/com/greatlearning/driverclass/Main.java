package com.greatlearning.driverclass;

import com.greatlearning.subdpartments.AdminDepartment;
import com.greatlearning.subdpartments.HrDepartment;
import com.greatlearning.subdpartments.TechDepartment;

public class Main {

	public static void main(String[] args) {

		AdminDepartment adminDepartment = new AdminDepartment();
		// adminDepartment.departmentName();
		// adminDepartment.getTodaysWork();
		// adminDepartment.getWorkDeadline();
		// adminDepartment.isTodayAHoliday();

		System.out.println(adminDepartment.departmentName());
		System.out.println(adminDepartment.getTodaysWork()); 
		System.out.println(adminDepartment.getWorkDeadline());
		System.out.println(adminDepartment.isTodayAHoliday());
		System.out.println("");

		HrDepartment hrdepartment = new HrDepartment();
		// hrdepartment.departmentName();
		// hrdepartment.doActivity();
		// hrdepartment.getTodaysWork();
		// hrdepartment.getWorkDeadline();
		// hrdepartment.isTodayAHoliday();

		System.out.println(hrdepartment.departmentName());
		System.out.println(hrdepartment.doActivity());
		System.out.println(hrdepartment.getTodaysWork());
		System.out.println(hrdepartment.getWorkDeadline());
		System.out.println(hrdepartment.isTodayAHoliday());
		System.out.println("");

		TechDepartment techDepartment = new TechDepartment();
		// techDepartment.departmentName();
		// techDepartment.getTodaysWork();
		// techDepartment.getWorkDeadline();
		// techDepartment.getTechStackInformation();
		// techDepartment.isTodayAHoliday();

		System.out.println(techDepartment.departmentName());
		System.out.println(techDepartment.getTodaysWork());
		System.out.println(techDepartment.getWorkDeadline());
		System.out.println(techDepartment.getTechStackInformation());
		System.out.println(techDepartment.isTodayAHoliday());

	}

}
