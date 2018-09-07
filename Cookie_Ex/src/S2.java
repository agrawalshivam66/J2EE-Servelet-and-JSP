

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
@WebServlet("/S2")
public class S2 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public S2() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		PrintWriter out = response.getWriter();
		response.setContentType("text/html");
		
		Cookie ck[] = request.getCookies();

		String city = request.getParameter("city");
		String state= request.getParameter("state");
		String country = request.getParameter("country");
		
		out.print("<h1>Whithin S2 Servlet</h1>");
		
		for(int i = 0; i<ck.length; i++)
		{
			out.print("<br>"+ck[i].getName()+"---"+ck[i].getValue());
		}

		out.print("<br>CITY: "+city);
		out.print("<br>STATE: "+state);
		out.print("<br>COUNTRY: "+country);
		
		Cookie ck1 = new Cookie("city", city);
		Cookie ck2 = new Cookie("state", state);
		Cookie ck3 = new Cookie("country", country);
		response.addCookie(ck1);
		response.addCookie(ck2);
		response.addCookie(ck3);
		
		out.print("<br><a href='S3'> Click here for S3</a>");
	}
	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
