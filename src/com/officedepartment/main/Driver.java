package com.officedepartment.main;
import com.officedepartment.model.*;
import com.officedepartment.departmenttransactions.*;

public class Driver 
{
	public static void main(String[] args)
	{
		DepartmentFunctionalities df = new DepartmentFunctionalities();
		// Printing Admin Functionalities//
		AdminDepartment adm = new AdminDepartment();
		df.printAdminFunctionalities(adm);
		
		//Printing HR Functionalities\\
		HrDepartment hr = new HrDepartment();
		df.printHrFunctionalities(hr);
		
		//Printing Tech Functionalities//
		TechDepartment td = new TechDepartment();
		df.printTechFunctionalities(td);
		
	}

}
