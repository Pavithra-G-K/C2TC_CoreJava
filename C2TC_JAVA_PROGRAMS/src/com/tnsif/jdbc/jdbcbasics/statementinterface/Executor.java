package com.tnsif.jdbc.jdbcbasics.statementinterface;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

//import java.sql.*;

public class Executor {

	public static void main(String[] args) {
		
		
		StatementInterfaceDemo.showEmp();
		
		 // StatementInterfaceDemo.showEmp();
		  System.out.println("----------------------------------------------");
		  System.out.println(StatementInterfaceDemo.updateEmpName(4, "praveen"));
		  System.out.println(StatementInterfaceDemo.updateEmpName(1, "prakash"));
		  StatementInterfaceDemo.showEmp();
		  
		  
			/*
			 * StatementInterfaceDemo.updateEmpSalary(4, 65000);
			 * System.out.println("-------------After Updating Name and Salary------------"
			 * ); StatementInterfaceDemo.showEmp();
			 * 
			 * StatementInterfaceDemo.deleteEmp(3);
			 * 
			 * StatementInterfaceDemo.deleteEmp(101); StatementInterfaceDemo.deleteEmp(102);
			 * System.out.println("-----------After Deleting --------------------");
			 * StatementInterfaceDemo.showEmp();
			 */		 
	}

}
