package com.psl.employee.permanent;

import java.io.Serializable;

import com.psl.employee1.Date;
import com.psl.employee1.Employee;

// Permanetnt
public  class TechnicalAssociates extends permanent  implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public TechnicalAssociates(String fname, String lname, String salary,String grade, Date joining_date) {
		super(fname, lname, salary, grade, joining_date);
	}

	@Override
	public float calculateBonus() {
	 return	bonus= 1.8f * Float.parseFloat(salary);
	}
	
	@Override
	public float getMediclaim() {
		return Float.parseFloat(salary)*2.0f;
	}

	@Override
	public String getSalary1(Employee e) {
		TechnicalAssociates tech= (TechnicalAssociates) e;
		Date date=tech.getJoining_date();
		System.out.println(((2014-date.getYear())*5000)+ Integer.parseInt(tech.getSalary()));
		return ((2014-date.getYear())*5000)+ Integer.parseInt(tech.getSalary())+"";
	}

	@Override
	public String toString() {
		return "TechnicalAssociates [calculateBonus()=" + calculateBonus()
				+ ", getMediclaim()=" + getMediclaim() + ", getEmp_id()="
				+ getEmp_id() + ", getFname()=" + getFname() + ", getLname()="
				+ getLname() + ", getSalary()=" + getSalary() + ", getGrade()="
				+ getGrade() + ", getJoining_date()=" + getJoining_date()
				+ ", getClass()=" + getClass() + ", hashCode()=" + hashCode()
				+ ", toString()=" + super.toString() + "]";
	}
	
	// to String
	

}
