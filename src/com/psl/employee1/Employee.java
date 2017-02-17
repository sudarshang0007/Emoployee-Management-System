package com.psl.employee1;

import java.io.Serializable;

public abstract class Employee{
	static int emp_count;
	String emp_id;
	String fname;
	String lname;
	String salary;
	String grade;
	Date joining_date;

	public Employee(String emp_id,String fname,String lname,String salary,String grade,Date joining_date) {
		emp_count+=1;
		//System.out.println("Emp Count:"+emp_count);
		this.emp_id=emp_id;
		this.fname=fname;
		this.grade=grade;
		this.lname=lname;
		this.salary=salary;
		this.joining_date=joining_date;
	}


	public abstract float calculateBonus();
	

	public String getEmp_id() {
		return emp_id;
	}

	public void setEmp_id(String emp_id) {
		this.emp_id = emp_id;
	}

	public String getFname() {
		return fname;
	}

	public void setFname(String fname) {
		this.fname = fname;
	}

	public String getLname() {
		return lname;
	}

	public void setLname(String lname) {
		this.lname = lname;
	}

	public String getSalary() {
		return salary;
	}

	public void setSalary(String salary) {
		this.salary = salary;
	}

	public String getGrade() {
		return grade;
	}

	public void setGrade(String grade) {
		this.grade = grade;
	}

	public Date getJoining_date() {
		return joining_date;
	}

	/**
	 * @param joining_date this joinnig date while setting the 
	 */
	public void setJoining_date(Date joining_date) {
		this.joining_date = joining_date;
	}

}
