package incoraysCtl;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import MarksheetBean.MarksheetBean;
import MarksheetModel.MarksheetModel;
@WebServlet("/MarksheetCtl")

public class MarksheetCtl extends HttpServlet{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("in do get");
		String id = req.getParameter("id");
		String Name = req.getParameter("Name");
		String maths = req.getParameter("maths");
		String physics = req.getParameter("physics");
		String chemistry = req.getParameter("chemistry");
		String rollno = req.getParameter("rollno");
		
		MarksheetBean bean = new MarksheetBean();
		bean.setId(Integer.parseInt(id));
		bean.setname(Name);
		bean.setPhysics(Integer.parseInt(physics));
		bean.setChemistry(Integer.parseInt(chemistry));
		bean.setMaths(Integer.parseInt(maths));
		bean.setRollno(Integer.parseInt(rollno));
		
		MarksheetModel model = new MarksheetModel();
	     try {
			model.testadd(bean);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		PrintWriter out = resp.getWriter();
		out.print("<h1>data added sucessfully</h1>");
		req.setAttribute("msg", "updated sucessfully");
		resp.sendRedirect("WelcomeStudents.jsp");
		RequestDispatcher rd = req.getRequestDispatcher("WelcomeStudents.jsp");
		rd.forward(req, resp);
		
		
	}

	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		System.out.println("in do post");
	}

}
