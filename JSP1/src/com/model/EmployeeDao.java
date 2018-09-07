package com.model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.LinkedList;

import com.db.Employee;
import com.db.Provider;

public class EmployeeDao {

 	public static int save(Employee e)
 	{
 		int status=0;
 		try
 		{
 		Connection con = Provider.getConnection();
 		String sql = "insert into Employee values(?,?,?,?)";
 		PreparedStatement pst = con.prepareStatement(sql);
 		pst.setString(1, e.getUserid());
 		pst.setString(2,e.getPassword());
 		pst.setString(3,e.getDepartment());
 		pst.setString(4,e.getLocation());
 		status=pst.executeUpdate();
 		}
 		
 		catch (Exception e2) {
			e2.printStackTrace();
		}
 		return status;
 	}

 	public static LinkedList<Employee> getDetails()
 	{
 		LinkedList<Employee> list = new LinkedList<Employee>();
 		try
 		{
 		Connection con = Provider.getConnection();
 		String sql = "select * from Employee";
 		PreparedStatement pst = con.prepareStatement(sql);
 		ResultSet rs = pst.executeQuery();
 				while(rs.next())
 				{
 					Employee e = new Employee();
 					e.setUserid(rs.getString(1));
 					e.setPassword(rs.getString(2));
 					e.setDepartment(rs.getString(3));
 					e.setLocation(rs.getString(4));
 					list.add(e);
 				}
 
 		}
 		
 		catch (Exception e2) {
			e2.printStackTrace();
		}
 		return list;
 	}

}

