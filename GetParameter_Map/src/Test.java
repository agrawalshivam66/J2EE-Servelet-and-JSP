import java.util.*;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;

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
		
	Map<String, String[]> data = request.getParameterMap();
	Set<String> keys = data.keySet();	
	
	for(Object param_name: keys)
	{
		out.print("<hr>"+param_name);
		String param_values[] = data.get(param_name);
		
		for(int i=0; i < param_values.length; i++)
		{
			out.print("<br>"+param_values[i]);
		}
	}
	
		}	
	}


