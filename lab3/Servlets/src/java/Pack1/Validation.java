package Pack1;

/*
    Please note that the latest versions of Java use the
    Jakarta 10 EE  and the older versions use the Java 5 EE
    so the package name changed from javax to jakarta.
*/

import java.io.IOException;
import java.io.PrintWriter;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

/**
 *
 * @author roshan
 */
public class Validation extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            String uname = request.getParameter("username");
            String pwd = request.getParameter("passwd");
            
            if (uname.equalsIgnoreCase("roshan") && 
                    pwd.equalsIgnoreCase("y21cs160"))
            {
                out.println("<h1>Welcome <em>"+uname+"</em></h1>");
                out.println("<h3>Login success</h3>");
            }
            else
            {
                out.println("<h1 style=\"color: red;\">LOGIN FAILED</h1>");
            }
        }
    }
    
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }
}
