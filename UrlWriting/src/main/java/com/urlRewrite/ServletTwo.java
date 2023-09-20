package com.urlRewrite;

import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class ServletTwo extends HttpServlet {
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		resp.setContentType("text/html");
		PrintWriter out = resp.getWriter();
		out.println("<h2 style='color:blue;'> Welcome TO Second Servlet</h2>");
		String name = req.getParameter("user");
		out.println("<h2 style='color:red;'> Hello " + name + ",Thanks For Using Our Servlet.</h2>");
	}

}
