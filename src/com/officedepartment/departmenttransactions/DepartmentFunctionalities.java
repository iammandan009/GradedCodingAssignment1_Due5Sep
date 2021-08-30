package com.officedepartment.departmenttransactions;
import com.officedepartment.model.*;


public class DepartmentFunctionalities 
{
   public void printAdminFunctionalities(AdminDepartment admin)
   {
	   System.out.println("Welcome to Admin Department");
	   System.out.println(admin.getTodaysWork());
	   System.out.println(admin.getWorkDeadline());
	   System.out.println(admin.isTodayAHoliday());
	   System.out.println("");
   }
	
   public void printHrFunctionalities(HrDepartment hr)
   
   {
	   System.out.println("Welcome to HR Department");
	   System.out.println(hr.DoActivity());
	   System.out.println(hr.getTodaysWork());
	   System.out.println(hr.getWorkDeadline());
	   System.out.println(hr.isTodayAHoliday());
	   System.out.println("");
   }
   
   public void printTechFunctionalities(TechDepartment td)
   {
	   System.out.println("Welcome to Tech Department");
	   System.out.println(td.getTodaysWork());
	   System.out.println(td.getWorkDeadline());
	   System.out.println(td.getTechStackInformation());
	   System.out.println(td.isTodayAHoliday());
   }   
  

}
