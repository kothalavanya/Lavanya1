package com.niit.loginapp.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import com.niit.loginapp.dao.UserDAO;

/**
 * Servlet implementation class LoginServlet
 */
@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		System.out.println("Calling the method doGet ");
			}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		System.out.println("Calling the method doPost ");
		String username=(String)request.getParameter("username");
		String password=(String)request.getParameter("password");
		UserDAO userDAO = new UserDAO();
		RequestDispatcher dispatcher;
		
		if(userDAO.isValidUser(username,password))
		{
			dispatcher = request.getRequestDispatcher("Home.jsp");
			dispatcher.forward(request, response);
		}
		else
		{
			dispatcher = request.getRequestDispatcher("Login.jsp");
			PrintWriter writer = response.getWriter();
			writer.println("Invalid login credentials....");
			dispatcher.include(request, response);
			
		}
		
		
	}

}
