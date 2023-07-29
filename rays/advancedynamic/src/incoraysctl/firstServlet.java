package incoraysctl;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;



@WebServlet("/firstServlet")

public class firstServlet extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		
		String firstName = req.getParameter("firstName"); 
		String lastName = req.getParameter("lastName"); 
		String loginId = req.getParameter("loginId"); 
		String password = req.getParameter("password");
		String address = req.getParameter("address");
		
		System.out.println(firstName);
		System.out.println(lastName);
		System.out.println(loginId);
		System.out.println(password);
		System.out.println(address);
		System.out.println("in do get");
		resp.setContentType("text/html");
		
		PrintWriter out = resp.getWriter();
		
		out.print(firstName+""+lastName+""+loginId+""+password+""+address);
		out.close();
		
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
	}

}
