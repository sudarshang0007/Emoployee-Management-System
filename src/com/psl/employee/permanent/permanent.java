package com.psl.employee.permanent;


import java.io.Serializable;

import com.psl.employee1.Date;
import com.psl.employee1.Employee;

public abstract class permanent extends Employee{

	static int emp_id=1;
	String salary;
	float bonus;
	public permanent(String fname, String lname, String salary, String grade,Date joining_date) {
		super("P"+emp_id, fname, lname, salary, grade, joining_date);
		this.salary=salary;
		emp_id+=1;
	}

	@Override
	public float calculateBonus() {
		return bonus= 1.8f * Float.parseFloat(salary);
	}

	public abstract float getMediclaim();
	public abstract String getSalary1(Employee e);
}
