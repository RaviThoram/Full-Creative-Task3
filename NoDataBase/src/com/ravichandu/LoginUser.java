package com.ravichandu;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class LoginUser
 */
@WebServlet("/LoginUser")
public class LoginUser extends HttpServlet {
	private static final long serialVersionUID = 1L;
	

	public String username;
	public String password;

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		username = request.getParameter("username1");
		password = request.getParameter("password1");

		//HttpSession session = request.getSession(false);

		String userName = (String) getServletContext().getAttribute(username + "session");
		String passWord = (String) getServletContext().getAttribute(username + "passsession");

		try {
			if (userName.equals(username) && passWord.equals(password)) {

				PrintWriter out = response.getWriter();
				out.print("<a href='https://www.google.com' style='font-size:126px;'>Click If U Want To Browse</a>");
			} else {

				response.sendRedirect("index.html");
			}
		} catch (NullPointerException e) {
			response.sendRedirect("index.html");
		}

	}
}
