package web.controller.profile;

import java.io.IOException;

import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import repository.AuthDao;
import repository.UserDao;
import repository.user.User;
import web.service.AuthService;
import web.service.AuthServiceImpl;
import web.service.ProfileService;
import web.service.ProfileServiceImpl;

/**
 * Servlet implementation class MyPageServlet
 */
@WebServlet("/profile/update")
public class ProfileUpdateServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private ProfileService profileService;
	private AuthService authService;
	
	
	@Override
		public void init(ServletConfig config) throws ServletException {
			ServletContext servletContext = config.getServletContext();
			profileService = new ProfileServiceImpl((UserDao)servletContext.getAttribute("userDao"));
			authService = new AuthServiceImpl((AuthDao)servletContext.getAttribute("authDao"));
		}
	
	       
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    	request.getRequestDispatcher("/WEB-INF/views/profile/profile-update.jsp").forward(request, response);
	}
    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    	request.setCharacterEncoding("utf-8");
    	String name = request.getParameter("name");
    	String email = request.getParameter("email");
    	
    	HttpSession session = request.getSession();
    	User principalUser = (User)session.getAttribute("principal");
    	
    	boolean flag = profileService.updateProfile(principalUser.getUser_code(), name, email);
    	if(flag == true) {
    		response.sendRedirect("/JspStudy_8452/profile/mypage");
    	}
    }
}
