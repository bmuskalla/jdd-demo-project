import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class ResponseSplitting extends HttpServlet {
  protected void doGet(HttpServletRequest request, HttpServletResponse response)
  throws ServletException, IOException {
    // User provided value
    String cardSecurityCode = request.getParameter("cardSecurityCode");
    Runtime.getRuntime().exec("validateCode.sh " + cardSecurityCode);
  }
}