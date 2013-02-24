package plainjavaservlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.json.JSONException;
import org.json.JSONObject;

public class ServletController extends HttpServlet {
	private static final long serialVersionUID = -2072644970465198198L;
	private ServletService servletService;
   
    @Override
    public void init() {
        setServletService(new ServletService());
    }

    public void setServletService(ServletService servletService) {
        this.servletService = servletService;
    }

    @Override
    public void doGet(HttpServletRequest request, HttpServletResponse response)
                                                        throws ServletException,IOException {
        PrintWriter pw = response.getWriter();
        response.setContentType("application/json");
        JSONObject json = new JSONObject();
        try {
            json.put("controller", true);
            json.put("service", true);
            json.put("date", servletService.getDate());
        } catch (JSONException e) {
            e.printStackTrace();
        }
        pw.print(json.toString());
    }

}
