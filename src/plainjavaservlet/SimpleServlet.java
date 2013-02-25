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

public class SimpleServlet extends GenericServlet implements Servlet, ServletConfig {

	private static final long serialVersionUID = 3948245126352292249L;

	private ServletService servletService;
	
	@Override
    public void init() {
        setServletService(new ServletService());
    }

    public void setServletService(ServletService servletService) {
        this.servletService = servletService;
    }
	
	@Override
	public void service(ServletRequest request, ServletResponse response)
			throws ServletException, IOException {
		PrintWriter pw = response.getWriter();
		servletService.initJanuary();
		String m = servletService.getMonths().get(0);
		pw.write("<svg>Hello!</svg>");
		pw.write(m);
	}

}
