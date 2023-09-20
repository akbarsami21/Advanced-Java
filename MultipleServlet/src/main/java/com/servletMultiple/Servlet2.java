package com.servletMultiple;

import javax.servlet.http.*;
import javax.servlet.http.*;
import java.io.*;

import javax.servlet.*;
public class Servlet2 extends HttpServlet{
	public void doGet(HttpServletRequest req,HttpServletResponse res)throws ServletException,IOException {
		
		res.setContentType("text/html");
		PrintWriter out=res.getWriter();
		Cookie c[]=req.getCookies();
		boolean f=false;
		String name="";
		if(c==null) {
			out.println("<h1> You Are New User, Please Submit Your Name On Home Page."+"</h1");
			return;
		}else {
			for(Cookie x:c) {
				String tname= x.getName();
				if(tname.equals("user_name")) {
					f=true;
					name=x.getValue();
				}
			}
		}if(f) {
			out.println("<h1> Your Name Is: "+name+" And You Are In Servlet Two</h1");
		}else {
			out.println("<h2> You Are New User, Please Submit Your Name On Home Page."+"</h2");
		}
		
	}

}