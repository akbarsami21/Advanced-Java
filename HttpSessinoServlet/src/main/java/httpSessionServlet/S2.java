package httpSessionServlet;

import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;

public class S2 extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.setContentType("text/html");
		PrintWriter out=resp.getWriter();
		String name = (String) req.getSession().getAttribute("username");

		out.println("<h1>Your Name Is : "+name+"</h1>");
		
	}

}
