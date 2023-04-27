package controller.user;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

@WebServlet("login-task")
public class LoginTaskController extends HttpServlet {
@Override
protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	
	
	String id = req.getParameter("id");
	String pass = req.getParameter("pass");
	SqlSessionFactory factory =  (SqlSessionFactory) req.getServletContext().getAttribute("sqlsessionfactory");
	SqlSession sqlsisson = factory.openSession();
	req.getRequestDispatcher("WEB-INF/view/login-task").forward(req, resp);
}
}
