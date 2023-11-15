package frontend;

import java.io.IOException;

import javax.servlet.Servlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
@WebServlet("/login")
public class login implements Servlet{

	@Override
	public void destroy() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public ServletConfig getServletConfig() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getServletInfo() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void init(ServletConfig config) throws ServletException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		String email = req.getParameter("email");
		String password = req.getParameter("password");
		//res.getWriter().print("came here");
		if(email.equals("abc")&&password.equals("abc")) {
			
			req.setAttribute("a", 100);
			req.getRequestDispatcher("Mul").forward(req, res);
		}
		else
		{
			//res.getWriter().print("wrong email and password try again");
			req.getRequestDispatcher("login.html").forward(req, res);
		}
		// TODO Auto-generated method stub
		
	}

}
