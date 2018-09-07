package com.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class StudentReg
 */
@WebServlet("/com.controller.StudentReg")
public class StudentReg extends HttpServlet {
	
	@Override
	public void init() throws ServletException {
	
		System.out.println("init() called for servlet");
	}
	
	public StudentReg() {
		System.out.println("object created for servlet");
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("request processing for servlet");
		
			PrintWriter out = response.getWriter();
			response.setContentType("text/html");
			
			String roll = request.getParameter("roll");
			String name = request.getParameter("name");
			String age = request.getParameter("age");
			
			out.print("<hr>ROLL: "+roll);
			out.print("<hr>NAME: "+name);
			out.print("<hr>AGE: "+age);
	}

	

}


