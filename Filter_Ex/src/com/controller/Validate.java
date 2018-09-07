package com.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;

@WebFilter("/com.controller.StudentReg")
public class Validate implements Filter {

 
    public Validate() {
    	System.out.println("Object created for filter");
      
    }

	public void destroy() {
		
	}


	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
		System.out.println("Request Processing for filter");
		
		PrintWriter out = response.getWriter();
		response.setContentType("text/html");
		
		String roll = request.getParameter("roll");
		String name = request.getParameter("name");
		int age = Integer.parseInt( request.getParameter("age"));
		
		if(roll=="")
		{
			out.print("Roll field cannot be null... ");
			
		}
		
		else if(name == "")
			out.print("Name field cannot be null... ");
		
		else if(age < 0)
			out.print("Roll field cannot be null... ");
		
		else {
			out.print("<font color='red' size=20>");
			chain.doFilter(request, response);
	}
	}
	
	public void init(FilterConfig fConfig) throws ServletException {
		System.out.println("init() method called for filter");
	}

}
