

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class FindBill
 */
@WebServlet("/FindBill")
public class FindBill extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public FindBill() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		PrintWriter out = response.getWriter();
		response.setContentType("text/html");
		
		int cbill = Integer.parseInt(request.getParameter("cbill"));
		int pbill = Integer.parseInt(request.getParameter("pbill"));
		request.setAttribute("unit_price", 3.5);
		
		out.print("<h3>The following is the Bill Particulars...</h3><hr>");
		out.print("<br>Current Bill in Units : "+cbill);
		out.print("<br>Previous Bill in Units : "+pbill);
		out.print("<hr><hr><hr>");
		
		RequestDispatcher rd = request.getRequestDispatcher("CalculateBill");
		rd.include(request, response);
	
	out.print("<h4>Please Pay Bill Before 10th of Next Month</h4?<hr>");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
