

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

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
		
		String id = request.getParameter("id");
		String name= request.getParameter("name");
		String age = request.getParameter("age");
		String branch= request.getParameter("branch");
		String college = request.getParameter("college");
		String phone=request.getParameter("phone");
		String email = request.getParameter("email");
		String city = request.getParameter("city");
		String address = request.getParameter("address");
		
		
		out.print("<h1>Whithin S4 Servlet</h1>");
		out.print("<br>ROLL: "+id);
		out.print("<br>NAME: "+name);
		out.print("<br>AGE: "+age);
		out.print("<br>BRANCH: "+branch);
		out.print("<br>COLLEGE: "+college);
		out.print("<br>Email: "+email);
		out.print("<br>Phone: "+phone);
		out.print("<br>City: "+city);
		out.print("<br>Address: "+address);
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
