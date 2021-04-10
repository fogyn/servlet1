import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class ServletAverage extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        int num1 = Integer.parseInt(request.getParameter("num1"));
        int num2 = Integer.parseInt(request.getParameter("num2"));
        int num3 = Integer.parseInt(request.getParameter("num3"));
        String dev = request.getParameter("todo");
        //System.out.println(num1 + " - " + num2 + " - " + num3);
       // System.out.println("---------------");
        request.setAttribute("num1", num1);
        request.setAttribute("num2", num2);
        request.setAttribute("num3", num3);
        request.setAttribute("todo", dev);

        String rezult = "";
        switch (dev){
            case "Average":
                rezult = average(num1, num2, num3)+"";
                //rezult = "Average = "+rezult;
                System.out.println(rezult);
                request.setAttribute("rezult", rezult);
                break;
            case "Max":
                rezult = max(num1, num2, num3)+"";
                //rezult = "Max = "+rezult;
                System.out.println(rezult);
                request.setAttribute("rezult", rezult);
                break;
            case "Min":
                rezult = min(num1, num2, num3)+"";
                //rezult = "Min = "+rezult;
                System.out.println(rezult);
                request.setAttribute("rezult", rezult);
                break;
        }
        //request.setAttribute("avg", rez);

        getServletContext().getRequestDispatcher("/Average.jsp").forward(request, response);
    }

    private int average(int num1, int num2, int num3) {
        return (num1 + num2 + num3) / 3;
    }

    private int max(int num1, int num2, int num3) {
        int rez = 0;
        if (num1 >= num2) {
            if (num1 >= num3) {
                rez = num1;
            }

        } else {
            if (num2 >= num3) {
                rez = num2;
            } else {
                rez = num3;
            }
        }
        return rez;
    }

    private int min(int num1, int num2, int num3) {
        int rez = 0;
        if (num1 <= num2) {
            if (num1 <= num3) {
                rez = num1;
            }

        } else {
            if (num2 <= num3) {
                rez = num2;
            } else {
                rez = num3;
            }
        }

        return rez;
    }
}
