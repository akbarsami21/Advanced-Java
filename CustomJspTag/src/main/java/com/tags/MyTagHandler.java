package com.tags;

import java.io.IOException;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspWriter;
import javax.servlet.jsp.tagext.TagSupport;

public class MyTagHandler extends TagSupport {

	@Override
	public int doStartTag() throws JspException {
		JspWriter out = pageContext.getOut();
		try {
			ZoneId zone = ZoneId.of("Asia/Dhaka");
			LocalDateTime currentTime = LocalDateTime.now(zone);
			DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
			String formattedTime = currentTime.format(formatter);
			
			out.println("<h1>This is my custom tag.</h1>");
			out.println("<h1>Bangladesh Time : "+formattedTime+"</h1>");
		} catch (IOException e) {

			e.printStackTrace();
		}
		return SKIP_BODY;
	}

}
