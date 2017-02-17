package com.psl.employee.contract;

import java.io.Serializable;

import com.psl.employee1.Date;
import com.psl.employee1.Employee;

public class EmpContract extends Employee {

	static int emp_id =1;
	String contract_name;
	float bonus;
	String salary;
	
	public EmpContract(String fname, String lname, String salary, String grade,Date joining_date,String contract_name) {
		super("C"+emp_id, fname, lname, salary, grade, joining_date);
		this.contract_name=contract_name;
		emp_id+=1;
		this.salary=salary;
	}
	
	@Override
	public float calculateBonus() {
	 return	bonus = 1.2f * Float.parseFloat(salary);
	}

}
