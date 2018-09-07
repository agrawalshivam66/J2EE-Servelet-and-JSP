

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
		
		String id = request.getParameter("id");
		String name= request.getParameter("name");
		String age = request.getParameter("age");
		String branch= request.getParameter("branch");
		String college = request.getParameter("college");
		

		out.print("<h1>Whithin S2 Servlet</h1>");
		out.print("<br>ROLL: "+id);
		out.print("<br>NAME: "+name);
		out.print("<br>AGE: "+age);
		out.print("<br>BRANCH: "+branch);
		out.print("<br>COLLEGE: "+college);
		
		
	out.print("<form action='S3'>");	
	out.print("<input type = 'hidden' name='id' value="+id+">");
	out.print("<input type = 'hidden' name='name' value="+name+">");
	out.print("<input type = 'hidden' name='age' value="+age+">");
	out.print("<input type = 'hidden' name='branch' value="+branch+">");
	out.print("<input type = 'hidden' name='college' value="+college+">");

		out.print("<br>Email : <input type = 'text' name='email'>");
		out.print("<br>Phone : <input type = 'text' name='phone'>");
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
