package net.comtor.test.servlet3;

import jakarta.servlet.ServletException;
import jakarta.servlet.ServletOutputStream;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 *
 * @author juriel
 */
@WebServlet("/*")
public class Hello extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        ServletOutputStream out = resp.getOutputStream();
        out.print("<html><head></head><body>");
        out.print("<b>ContextPath:</b>" + req.getContextPath() + "<br/> "
                + "<b>PathInfo:</b> "       + req.getPathInfo() + "<br/>"
                + "<b>PathTranslated:</b> " + req.getPathTranslated() + "<br/>"
                + "<b>RequestURI:</b> " + req.getRequestURI() + "<br/>"  
        
        
        );
        out.print("</html>");
    }

}
