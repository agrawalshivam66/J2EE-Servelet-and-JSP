

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class S1
 */
@WebServlet("/S4")
public class S4 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public S4() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		PrintWriter out = response.getWriter();
		response.setContentType("text/html");
		
		
		out.print("<h1>Whithin S4 Servlet</h1>");
		
		HttpSession session = request.getSession();
		String id = (String)session.getAttribute("id");
		String name = (String)session.getAttribute("name");
		String age = (String)session.getAttribute("age");
		String city = (String)session.getAttribute("city");
		String state = (String)session.getAttribute("state");
		String country = (String)session.getAttribute("country");
		
		out.print("<br>Name: "+name);
		out.print("<br>ID: "+id);
		out.print("<br>age: "+age);
		out.print("<br>CITY: "+city);
		out.print("<br>STATE: "+state);
		out.print("<br>COUNTRY: "+country);
		
		session.invalidate();
		out.print("<br><a href='S5'> Click here for S5</a>");
	}
		
		
	
	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
