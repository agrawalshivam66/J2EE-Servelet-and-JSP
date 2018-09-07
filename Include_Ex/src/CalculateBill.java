

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
@WebServlet("/CalculateBill")
public class CalculateBill extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public CalculateBill() {
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
		Double unit_price = (Double)request.getAttribute("unit_price");
		Double total_bill = cbill*unit_price - pbill*unit_price;
		
		
		out.print("<h3>The following is the Bill Particulars...</h3><hr>");
		out.print("<br>Current Bill (Rs): "+cbill*unit_price);
		out.print("<br>Previous Bill (Rs): "+pbill*unit_price);
		out.print("<br>Total Bill (Rs): "+total_bill);
		out.print("<hr><hr><hr>");
	
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
