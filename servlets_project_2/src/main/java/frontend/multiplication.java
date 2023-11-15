package frontend;

import java.io.IOException;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
@WebServlet("/Mul")
public class multiplication extends GenericServlet{

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//int num1=Integer.parseInt(req.getParameter("num1"));
		//int num2=Integer.parseInt(req.getParameter("num2"));
		//res.getWriter().print("multiplication of num1 and num2 is "+(num1*num2));
		
		 int x =(int) req.getAttribute("a");
		 res.getWriter().print(x);
		 res.getWriter().print(req.getAttribute("a"));
	}

}
