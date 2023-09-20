package httpSessionServlet;

import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;

public class Main extends HttpServlet {

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.setContentType("text/html");
		PrintWriter out=resp.getWriter();
		HttpSession hs = req.getSession();
		String name=req.getParameter("user_name");
		hs.setAttribute("username", name);
		out.println("<a href='server2'>Go to Servlet 2</a>");
	}

}
