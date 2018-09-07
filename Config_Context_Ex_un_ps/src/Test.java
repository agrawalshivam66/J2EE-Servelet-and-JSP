
import java.sql.*;
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Test
 */
public class Test extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Test() {
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
		
		String un = config.getInitParameter("un");
		String ps = config.getInitParameter("ps");
		String driver = context.getInitParameter("driver");
		String url = context.getInitParameter("url");
		
		out.print("<h1>Within Test Servlet</h1><hr>");
		out.print("<hr>username : "+un);
		out.print("<hr>password : "+ps);
		out.print("<hr>driver : "+driver);
		out.print("<hr>url : "+url);
		
		Connection con = null;
		try
		{
			Class.forName(driver);
			con = DriverManager.getConnection(url,un,ps);
			out.print("<hr>Connection object is : </hr>"+con);
		}
		catch (Exception e)
		{
			e.printStackTrace();
		}
	}

}
