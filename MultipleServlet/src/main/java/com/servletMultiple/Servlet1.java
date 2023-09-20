package com.servletMultiple;

import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
public class Servlet1 extends HttpServlet{
	@Override
	public void doGet(HttpServletRequest req,HttpServletResponse res)throws ServletException,IOException{
		
		res.setContentType("text/html");
		PrintWriter out=res.getWriter();
		
		String name=req.getParameter("name");
		out.println("<h1> Your Name Is: "+name+" And You Are In Servlet One</h1");
		out.println("<h1><a href='servlet2'>Go To Servlet2</a></h1>");
		Cookie c=new Cookie("user_name",name);
		res.addCookie(c);
	}

}
