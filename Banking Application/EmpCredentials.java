package com.greatlearning.servicves;

import com.greatlearning.model.Employee;

public interface EmpCredentials {

	public String generateEmailId(String fname, String lname, String dept);

	public String password();

	public void showDetails(Employee e);

}
