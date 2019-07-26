package com.ravichandu;

import java.io.IOException;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class SaveData
 */
@WebServlet("/SaveData")
public class SaveData extends HttpServlet {
	private static final long serialVersionUID = 1L;


	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String username1 = request.getParameter("username");
		String password1 = request.getParameter("password");
		

		//HttpSession session=request.getSession();
		ServletContext context=request.getServletContext();
		context.setAttribute(username1+"session", username1);
		context.setAttribute(username1+"passsession", password1);
		response.sendRedirect("index.html");

	}


}
