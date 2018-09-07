

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Test
 */
@WebServlet("/Validate")
public class Validate extends HttpServlet {

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		PrintWriter out = response.getWriter();
		response.setContentType("text/html");
		
	
		String un = request.getParameter("un");
		String ps = request.getParameter("ps");
		
		out.print("<hr>Within Validate Servlet");
		
		if(un.equals("ps"))
		{
			out.print("Login Success");
		}
		else
		{
			out.print("Invalid Username or Password");
		}
		out.print("OK");
		
	}

}
