package hiddenField;

import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class S2 extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.setContentType("text/html");
		PrintWriter out = resp.getWriter();
		String name = req.getParameter("user_name");
		out.println("<h1>Welcome To Second Server</h1>");
		out.println("<h2>Your Name Is: " + name + "</h2>");
	}

}
