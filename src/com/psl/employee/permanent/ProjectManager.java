package com.psl.employee.permanent;

import java.io.Serializable;

import com.psl.employee1.Date;
import com.psl.employee1.Employee;


public class ProjectManager extends permanent implements Serializable  {

	public ProjectManager(String fname, String lname, String salary,String grade, Date joining_date) {
		super(fname, lname, salary, grade, joining_date);
	}

	@Override
	public float getMediclaim() {
		return Float.parseFloat(salary);
	}

	@Override
	public String getSalary1(Employee e) {
		ProjectManager tech= (ProjectManager) e;
		Date date=tech.getJoining_date();
		System.out.println(((2014-date.getYear())*5000)+ Integer.parseInt(tech.getSalary()));
		return ((2014-date.getYear())*5000)+ Integer.parseInt(tech.getSalary())+"";
	}

	@Override
	public String toString() {
		return "ProjectManager [getMediclaim()=" + getMediclaim()
				+ ", calculateBonus()=" + calculateBonus() + ", getEmp_id()="
				+ getEmp_id() + ", getFname()=" + getFname() + ", getLname()="
				+ getLname() + ", getSalary()=" + getSalary() + ", getGrade()="
				+ getGrade() + ", getJoining_date()=" + getJoining_date()
				+ ", getClass()=" + getClass() + ", hashCode()=" + hashCode()
				+ ", toString()=" + super.toString() + "]";
	}

}
