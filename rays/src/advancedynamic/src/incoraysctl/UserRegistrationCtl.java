package incoraysctl;

import java.io.IOException;

import java.io.PrintWriter;
import java.text.ParseException;
import java.text.SimpleDateFormat;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import incomraysbean.UserBean;
import incomraysmodel.UserModel;
@WebServlet("/UserRegistrationCtl")
public class UserRegistrationCtl extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String firstName = req.getParameter("firstName");
		String lastName = req.getParameter("lastName");
		String loginId = req.getParameter("loginId");
		String password = req.getParameter("password");
		String address = req.getParameter("address");
		String dob = req.getParameter("dob");
		
		UserBean bean = new UserBean();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		bean.setFirstName(firstName);
		bean.setLastName(lastName);
		bean.setLoginId(loginId);
		bean.setPassword(password);
		bean.setAddress(address);
		try {
			bean.setDob(sdf.parse(dob));
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		UserModel model = new UserModel();
		try {
			model.Add(bean);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		resp.setContentType("text/html");
	PrintWriter out	=resp.getWriter();
	out.print("<h1>data inserted sucessfully </h1>");
	RequestDispatcher rd =req.getRequestDispatcher("welcome1.jsp");
	rd.forward(req, resp);
	req.setAttribute("deal", "badi deal......!!");
	req.getAttribute("deal");
	out.close();
		
	
		
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		
	}
	

}
