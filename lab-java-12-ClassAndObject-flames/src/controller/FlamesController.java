package controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import service.FlameCalculator;

/**
 * Servlet implementation class FlamesController
 */
@WebServlet("/FlamesController")
public class FlamesController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public FlamesController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String name1 = request.getParameter("your");
		String name2 = request.getParameter("crush");
		
		FlameCalculator fc = new FlameCalculator(name1,name2);
		
		String flames = fc.flames(name1, name2);
		
		if (flames.equals("F")) {
			response.sendRedirect("siblings.jsp");
		} else if (flames.equals("L")) {
			response.sendRedirect("lovers.jsp");
		} else if (flames.equals("A")) {
			response.sendRedirect("affection.jsp");
		} else if (flames.equals("M")) {
			response.sendRedirect("marriage.jsp");
		} else if (flames.equals("E")) {
			response.sendRedirect("enemies.jsp");
		} else if (flames.equals("S")) {
			response.sendRedirect("siblings.jsp");
		}
	}

}
