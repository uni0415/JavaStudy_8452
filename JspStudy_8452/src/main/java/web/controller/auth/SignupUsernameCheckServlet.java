package web.controller.auth;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import db.DBConnectionMgr;
import repository.AuthDao;
import repository.AuthDaoImpl;
import web.service.AuthService;
import web.service.AuthServiceImpl;

@WebServlet("/auth/signup-username-check")
public class SignupUsernameCheckServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	private AuthService authService;

	@Override
	public void init() throws ServletException {
		DBConnectionMgr pool = DBConnectionMgr.getInstance();
		AuthDao authDao = new AuthDaoImpl(pool);
		authService = new AuthServiceImpl(authDao);
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/plain;charset=utf-8");
		PrintWriter out = response.getWriter();

		String username = request.getParameter("username");

		out.print(authService.usernameCheck(username));
	}
}
