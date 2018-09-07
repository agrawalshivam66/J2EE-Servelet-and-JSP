

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
@WebServlet("/S3")
public class S3 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public S3() {
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
		
	
		
		out.print("<h1>Whithin S3 Servlet</h1>");
		out.print("<br>ROLL: "+id);
		out.print("<br>NAME: "+name);
		out.print("<br>AGE: "+age);
		out.print("<br>BRANCH: "+branch);
		out.print("<br>COLLEGE: "+college);
		out.print("<br>Email: "+email);
		out.print("<br>Phone: "+phone);
		
	out.print("<form action='S4'>");	
	
	out.print("<input type = 'hidden' name='id' value="+id+">");
	out.print("<input type = 'hidden' name='name' value="+name+">");
	out.print("<input type = 'hidden' name='age' value="+age+">");
	out.print("<input type = 'hidden' name='branch' value="+branch+">");
	out.print("<input type = 'hidden' name='college' value="+college+">");
	out.print("<input type = 'hidden' name='phone' value="+phone+">");
	out.print("<input type = 'hidden' name='email' value="+email+">");
	
	
		out.print("<br>City : <input type = 'text' name='city'>");
		out.print("<br>Address : <input type = 'text' name='address'>");
		out.print("<br><input type = 'submit' name='next'>");
		out.print("</form>");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
