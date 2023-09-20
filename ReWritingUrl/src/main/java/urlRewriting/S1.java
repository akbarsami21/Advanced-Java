package urlRewriting;

import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
public class S1 extends HttpServlet{

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		resp.setContentType("text/html");
		PrintWriter out=resp.getWriter();
		String name=req.getParameter("user_name");
		out.println("<h2 style='color:red;'> Welcome To First Servlet</h2>");
		out.println("<h2 style='color:green;'> Your Name Is: "+name+"</h2>");
		out.println("<a href='s2?user="+name+"'>Go to Servlet 2</a>");
	}

}