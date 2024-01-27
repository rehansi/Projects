package com.greatlearning.subdpartments;

import com.greatlearning.Super.SuperDepartment;

public class AdminDepartment extends SuperDepartment {

	public String departmentName() {
		return "Welcome to the Admin Department";
	}

	public String getTodaysWork() {
		return "Complete your documents Submission";
	}

	public String getWorkDeadline() {
		return "Complete by EOD";
	}

}
