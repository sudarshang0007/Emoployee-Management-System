package com.psl.employee.contract;

import java.io.Serializable;

import com.psl.employee1.Date;

public class TechnicalAssociate extends EmpContract implements Serializable {


	public TechnicalAssociate(String fname, String lname, String salary,String grade, Date joining_date, String contract_name) {
		super(fname, lname, salary, grade, joining_date, contract_name);
	}

	@Override
	public String toString() {
		return "TechnicalAssociate [calculateBonus()=" + calculateBonus()
				+ ", getEmp_id()=" + getEmp_id() + ", getFname()=" + getFname()
				+ ", getLname()=" + getLname() + ", getSalary()=" + getSalary()
				+ ", getGrade()=" + getGrade() + ", getJoining_date()="
				+ getJoining_date() + ", getClass()=" + getClass()
				+ ", hashCode()=" + hashCode() + ", toString()="
				+ super.toString() + "]";
	}	
	
}
