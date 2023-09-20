package hiddenField;

import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
public class S1 extends HttpServlet{

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.setContentType("text/html");
		PrintWriter out=resp.getWriter();
		String name=req.getParameter("user_name");
		out.println("<h1>Welcome To First Server</h1>");
		out.println("<h2>Your Name Is: "+name+"</h2>");
		out.println(""
				+ "<form action='server2'>"
				+ "<input type='hideen' name='user_name' value="+name+">"
				+ "<button>Go To Second Servlet</button> "
								+ "</form>");
	}

}
