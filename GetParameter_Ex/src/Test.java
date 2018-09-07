

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Test
 */
@WebServlet("/Test")
public class Test extends HttpServlet {

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		PrintWriter out = response.getWriter();
		response.setContentType("text/html");
		
		int roll = Integer.parseInt(request.getParameter("roll"));
		String name = request.getParameter("name");
		int age = Integer.parseInt(request.getParameter("age"));
		
		out.print("<hr>ROLL: "+roll);
		out.print("<hr>NAME: "+name);
		out.print("<hr>AGE: "+age);
	}

}
