

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Demo
 */
public class Demo extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Demo() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		response.setContentType("text/html");
		
		ServletConfig config = getServletConfig();
		ServletContext context = getServletContext();
		
		String city = config.getInitParameter("city");
		String identified = config.getInitParameter("identified");
		String state = context.getInitParameter("state");
		
		out.print("<h1>Within Demo Servlet</h1><hr>");
		out.print("<hr>City : "+city);
		out.print("<hr>Identified : "+identified);
		out.print("<hr>State : "+state);
	}

}
