package web.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/login")
public class Login extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String username = "rudd1242";
		String password = "password";
		
		String username_input = request.getParameter("username");
		String password_input = request.getParameter("password");
		
		if(username_input.equals(username)&&password_input.equals(password)) {
			request.getRequestDispatcher("/WEB-INF/views/login_success.jsp").forward(request, response);
		}else {
			request.getRequestDispatcher("/WEB-INF/views/login_fail.jsp").forward(request, response);
		}
	}

}
