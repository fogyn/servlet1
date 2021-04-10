import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;



public class ServletBasic extends HttpServlet{

@Override
protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        //request.setAttribute("name", "Tom");
        //request.setAttribute("age", 34);
        request.setAttribute("letter", "Bad programmers worry about the code. Good program\u0002mers worry about" +
                " data structures and their relationship");

        getServletContext().getRequestDispatcher("/Latter.jsp").forward(request, response);
    }
}
