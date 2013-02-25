package plainjavaservlet;

import javax.servlet.GenericServlet;
import javax.servlet.Servlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.Serializable;

public class SimpleServlet extends GenericServlet implements Servlet, ServletConfig, Serializable {

	private static final long serialVersionUID = 3948245126352292249L;

	@Override
	public void service(ServletRequest request, ServletResponse response)
			throws ServletException, IOException {
		PrintWriter pw = response.getWriter();
		pw.write("<svg>Hello!</svg>");
	}

}
