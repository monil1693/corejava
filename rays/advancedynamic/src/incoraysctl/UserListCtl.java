package incoraysctl;

import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import incomraysbean.UserBean;
import incomraysmodel.UserModel;

@WebServlet("/UserListCtl.do")
public class UserListCtl extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		UserModel model = new UserModel();
		UserBean bean = null;
		String op = req.getParameter("operation");
		int pageNo = 1;
		int pageSize = 5;

		try {
			List list = model.search(bean, pageNo, pageSize);
			req.setAttribute("list", list);
			req.setAttribute("pageNo", pageNo);
			RequestDispatcher rd = req.getRequestDispatcher("UserListView.jsp");
			rd.forward(req, resp);

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		String FirstName = req.getParameter("FirstName");
		String dob = req.getParameter("dob");
		String op = req.getParameter("operation");
		UserModel model = new UserModel();
		int pageNo = 1;
		int pageSize = 5;
		pageNo = Integer.parseInt(req.getParameter("pageNo"));
		UserBean bean = new UserBean();

		if (op.equals("next")) {
			pageNo++;
		}
		if (op.equals("previous")) {
			pageNo--;

		}

		if (op.equals("add user")) {
			resp.sendRedirect("UserRegistrationCtl");
		}
		
		if (op.equals("delete")) {
				String [] ids = req.getParameterValues("ids");
				for (String id : ids) {
					try {
						model.testDelete(Integer.parseInt(id));
					} catch (Exception e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
			pageNo = 1;
		}

		if (op.equals("search")) {
			try {

				bean.setFirstName(FirstName);
				if (!(dob.equals(""))) {
					bean.setDob(sdf.parse(dob));
				}
			} catch (Exception e) {
				e.printStackTrace();
			} pageNo=1;


		}

		List list;
		try {
			list = model.search(bean, pageNo, pageSize);
			req.setAttribute("list", list);
			req.setAttribute("pageNo", pageNo);
			RequestDispatcher rd = req.getRequestDispatcher("UserListView.jsp");
			rd.forward(req, resp);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}