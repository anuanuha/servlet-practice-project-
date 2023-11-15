package frontend;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebInitParam;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = "/prime", initParams = @WebInitParam(name = "prime" ,value = "20"))
public class PrimeBuy extends HttpServlet
{ 
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String item = req.getParameter("item");
		double mobilePrice = 28000;
		double shirtPrice = 1200;
		double laptopprice = 72000;
        int normalDiscount = Integer.parseInt(getServletContext().getInitParameter("discount"));
        int primeDiscount = Integer.parseInt(getServletConfig().getInitParameter("prime"));
        int discount = normalDiscount+primeDiscount;
		double costPrice = 0;
		double sellingPrice = 0;
		double discountPrice = 0;
		if(item.equalsIgnoreCase("Mobile")) 
			costPrice = mobilePrice;
		else if(item.equalsIgnoreCase("Shirt")) 
				costPrice = shirtPrice;
		else
				costPrice = laptopprice;     
		
		discountPrice = (costPrice * discount)/100;
		sellingPrice = costPrice - discountPrice;
		resp.getWriter().print("<h1>you have selected:" + item +"</h1");
		resp.getWriter().print("<h1>cost price is:" + costPrice +"</h1");
		resp.getWriter().print("<h1>selling Price is:" + discountPrice +"</h1");
		resp.getWriter().print("<h1>discount Price is:" + sellingPrice +"</h1");
			
		}
		
	}