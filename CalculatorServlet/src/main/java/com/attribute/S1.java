package com.attribute;

import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class S1 extends HttpServlet{
	public void doPost(HttpServletRequest req,HttpServletResponse res) throws ServletException,IOException{
		res.setContentType("text/html");
		PrintWriter out=res.getWriter();
		out.println("<h1>");
		
		String n1=req.getParameter("n1");
		String n2=req.getParameter("n2");
		int nn1=Integer.parseInt(n1);
		int nn2=Integer.parseInt(n2);
		
		int sum=nn1+nn2;
		req.setAttribute("sum", sum);
		
		RequestDispatcher rd=req.getRequestDispatcher("s2");
		rd.forward(req, res);
		
	}

}
