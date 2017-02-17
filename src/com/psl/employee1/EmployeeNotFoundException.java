package com.psl.employee1;

public class EmployeeNotFoundException extends Exception {
	private String msg;
	
	public EmployeeNotFoundException(String msg) {
		this.msg=msg;
	}
	 public EmployeeNotFoundException() {
		super();
	}

}
