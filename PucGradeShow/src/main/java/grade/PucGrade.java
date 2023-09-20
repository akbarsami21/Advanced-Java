package grade;

import javax.servlet.http.*;
import java.io.*;
import javax.servlet.*;
public class PucGrade extends HttpServlet{

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.setContentType("text/html");
		PrintWriter out=resp.getWriter();
		
		String name=req.getParameter("user_name");
		String grade=req.getParameter("user_cgpa");
		float point= Float.parseFloat(grade);
		out.println("<h1 style='color: #ff4081;'>Welcome to My Server</h1>");
		if(point==4.00)
			out.println("<h2>Hey "+name+",You Got= A+.Congratulations For your Success</h2>");
		
		else if(point>=3.75 && point<4.00)
			out.println("<h2>Hey "+name+",You Got= A</h2>");

		else if(point>=3.50 && point<3.75)
			out.println("<h2>Hey "+name+",You Got= A-</h2>");
		
		else if(point>=3.25 && point<3.50)
			out.println("<h2>Hey "+name+",You Got= B+</h2>");
		
		else if(point>=3.00 && point<3.25)
			out.println("<h2>Hey "+name+",You Got= B</h2>");
		
		else if(point>=2.75 && point<3.00)
			out.println("<h2>Hey "+name+",You Got= B-</h2>");
		
		else if(point>=2.50 && point<2.75)
			out.println("<h2>Hey "+name+",You Got= C+</h2>");
		
		else if(point>=2.25 && point<2.50)
			out.println("<h2>Hey "+name+",You Got= C</h2>");
		
		else if(point>=2.00 && point<2.25)
			out.println("<h2>Hey "+name+",You Got= D</h2>");
		
		else if(point>=0.00 && point<2.00)
			
		out.println("<h2>Hey "+name+",You Are Fail.Better Luck Next & Do Hard Work</h2>");
		else
			out.println("<h2>Hey "+name+" You Type Wrong</h2>");
	     	

	}

}
