

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class S1
 */
@WebServlet("/S1")
public class S1 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public S1() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		PrintWriter out = response.getWriter();
		response.setContentType("text/html");
		
		String id = request.getParameter("id");
		String name= request.getParameter("name");
		String age = request.getParameter("age");
		
		out.print("<h1>Whithin S1 Servlet</h1>");
		out.print("<br>ROLL: "+id);
		out.print("<br>NAME: "+name);
		out.print("<br>AGE: "+age);
		out.print("<hr><hr>Enter Details...<hr>");
		
		Cookie ck1 = new Cookie("id", id);
		Cookie ck2 = new Cookie("name", name);
		Cookie ck3 = new Cookie("age", age);
		response.addCookie(ck1);
		response.addCookie(ck2);
		response.addCookie(ck3);
		
		out.print("<a href='address.html'> Click here for Address</a>");
	}
	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
