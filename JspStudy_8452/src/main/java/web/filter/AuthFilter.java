package web.filter;

import java.io.IOException;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import repository.user.User;

/**
 * Servlet Filter implementation class AuthFilter
 */
@WebFilter({ "/profile/*", "/board/*" })
public class AuthFilter extends HttpFilter implements Filter {
   
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public void init(FilterConfig fConfig) throws ServletException {
		
	}
	
	
	public void destroy() {


	}

	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
		HttpServletRequest hRequest = (HttpServletRequest)request;
		HttpSession session = hRequest.getSession();
		HttpServletResponse hResponse = (HttpServletResponse)response;
		User principalUser = (User)session.getAttribute("principal");
		
		if(principalUser == null) {
			hResponse.sendRedirect("/JspStudy_8452/auth/signin");
			return;
		}
		chain.doFilter(request, response);

	}


}
