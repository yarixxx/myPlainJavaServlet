package plainjavaservlet;

import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import org.json.*;
import javax.annotation.*;
import java.util.*;

public class ServletController extends HttpServlet {
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
