import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class SimpleLoginServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String username= request.getParameter("username");
        String password= request.getParameter("password");

        PrintWriter printWriter = response.getWriter();
        printWriter.println("<html>");
        if("admin".equals(username)&&
        "admin".equals(password)){
            printWriter.println("<h1>Welcome</h1>");
        }
        else{
            printWriter.println("Error!");
        }
        printWriter.println("</html>");

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
