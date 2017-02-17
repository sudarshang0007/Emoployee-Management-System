package com.psl.employee.util;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import com.psl.employee.permanent.ProjectManager;
import com.psl.employee1.Employee;

public class Serialization{

	public void doserialize(Employee em) {

		List<Employee> list=new ArrayList<Employee>();
		FileOutputStream fos=null;
		ObjectOutputStream oos=null;

		try {
			File file=new File("C:\\Employee.Ser");
			fos=new FileOutputStream(file,true);
			oos=new ObjectOutputStream(fos);
		//	list=desrialize();      // Take all members of file
			oos.writeObject(em);		
			
			for (Employee employee : list) {
				System.out.println(employee.toString());
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		finally{
			try {
				oos.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

	}

	public List<Employee> desrialize()
	{	
		//Employee em;
		List<Employee> list=new ArrayList<Employee>();
		FileInputStream fis=null;
		ObjectInputStream ois=null;
		
		try {
			fis=new FileInputStream("C:\\Employee.Ser");
			ois=new ObjectInputStream(fis);
			ProjectManager	em=(ProjectManager) ois.readObject();
				
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		finally{
			try {
				ois.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		return list;
	}

	// return id
	public void getID() {

	}
}
