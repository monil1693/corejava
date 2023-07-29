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
import javax.servlet.http.HttpSession;

//import org.apache.catalina.connector.Response;

import incomraysbean.UserBean;
import incomraysmodel.UserModel;

@WebServlet("/UserRegistrationCtl")
public class UserRegistrationCtl extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		String id = req.getParameter("id");
		System.out.println("in get user registractl");
		if (id != null) {
			UserModel model1 = new UserModel();

			try {
				UserBean bean1 = model1.findbypk(Integer.parseInt(id));
				req.setAttribute("bean", bean1);
				RequestDispatcher rd = req.getRequestDispatcher("UpdateUser1.jsp");
				rd.forward(req, resp);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		resp.sendRedirect("UserRegistrationView.jsp");
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");

		
		String FirstName = req.getParameter("FirstName");
		String lastName = req.getParameter("lastName");
		String loginId = req.getParameter("loginId");
		String password = req.getParameter("password");
		String dob = req.getParameter("dob");
		String address = req.getParameter("address");
		String op = req.getParameter("operation");
		String id = req.getParameter("id");

		UserBean bean = new UserBean();
		bean.setFirstName(FirstName);
		bean.setLastName(lastName);
		bean.setLoginId(loginId);
		bean.setPassword(password);
		try {
			bean.setDob(sdf.parse(dob));
		} catch (ParseException e) {
			e.printStackTrace();
		}
		bean.setAddress(address);

		UserModel model = new UserModel();
		
		if (op.equals("delete")) {
			try {
				model.testDelete(Integer.parseInt(id));
			} catch (NumberFormatException e) {
				e.printStackTrace();
			} catch (Exception e) {

				e.printStackTrace();
			}
		
		if (op.equals("signup")) {
			try {
				model.Add(bean);
				req.setAttribute("msg", "User Registered Successfully..!!!");
				RequestDispatcher rd = req.getRequestDispatcher("LoginCtl");
				rd.forward(req, resp);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}

		if (op.equals("update")) {

			bean.setId(Integer.parseInt(id));

			try {
				model.update(bean);
				resp.sendRedirect("UserListViewCtl");
			} catch (Exception e) {
				e.printStackTrace();
			}

		}

	}
	}
}