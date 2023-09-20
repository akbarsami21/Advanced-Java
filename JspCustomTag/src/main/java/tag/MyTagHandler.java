package tag;

import java.text.*;
import java.util.*;
import javax.servlet.jsp.*;
import javax.servlet.jsp.tagext.*;

public class MyTagHandler extends TagSupport {

	@Override
	public int doStartTag() throws JspException {
		try {
			Date date = new Date();
			SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
			String formattedDate = formatter.format(date);
			JspWriter out = pageContext.getOut();
			out.println("<h1>This is my custom tag</h1>");
			out.println("<h2>Bangladesh Time: " + formattedDate + " </h2>");
		} catch (Exception e) {
			e.printStackTrace();
		}

		return SKIP_BODY;
	}

}
