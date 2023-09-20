package com.tags;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspWriter;
import javax.servlet.jsp.tagext.TagSupport;

public class MyTagHandlerAttribute extends TagSupport {
    public int number;
    public String color;

    public void setNumber(int number) {
        this.number = number;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public int doStartTag() throws JspException {
        try {
            JspWriter out = pageContext.getOut();
            out.println("<h1>"+number+" Multiplication Table</h1>");
            out.println("<div style='color:" + color + "'>");
           // out.println("<br>");
            for (int i = 1; i <= 10; i++) {
                out.println("<h2>" + number + " X " + i + " = " + number * i + " </h2>");
            }
            out.println("</div>");
        } catch (Exception e) {
            e.printStackTrace();
        }

        return SKIP_BODY;
    }
}
