package com.psl.employee1;

import com.psl.employee.contract.TechnicalAssociate;
import com.psl.employee.permanent.ProjectManager;
import com.psl.employee.permanent.TechnicalAssociates;
import com.psl.employee.util.Serialization;

public class TestEmployee {


	public static void main(String[] args) {
		Date date=new Date(10,10,2014);
		String search="C3";
		Employee[] em=new Employee[10];
		Serialization ser=new Serialization();
		
		//em[0]= new TechnicalAssociate("sud", "hagvane", "2010", "0.3", new Date(10,10,2011), "XBCV ");
		em[1]=new TechnicalAssociates("sud", "gaikwad", "20100", "3.0", new Date(10,10,2010));
		em[2]=new ProjectManager("sudarshan", "hagvane",  "30100", "3.0", new Date(14,10,1990));
	//	em[3]= new TechnicalAssociate("Tenk", "mitr", "22100", "0.3", new Date(10,11,2000), "Chandf ");
		ser.doserialize(em[2]);
		ser.desrialize();

		for (int i = 0; i < 4 ;i++) 
		{
			if(em[i] instanceof ProjectManager){
				ProjectManager pm = (ProjectManager)em[i];
			}
			else if(em[i] instanceof TechnicalAssociates){
				TechnicalAssociates pm = (TechnicalAssociates)em[i];
			}
			System.out.println(em[i]);
			System.out.println();
		}
		System.out.println("Total Emp Count  :"+Employee.emp_count);
		
	}



}
