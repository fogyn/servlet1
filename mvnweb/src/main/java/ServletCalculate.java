import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class ServletCalculate extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        int num1 = Integer.parseInt(request.getParameter("num1"));
        int num2 = Integer.parseInt(request.getParameter("num2"));
        String dev = request.getParameter("todoCalculate");

        request.setAttribute("num1", num1);
        request.setAttribute("num2", num2);
        request.setAttribute("todoCalculate", dev);


        if(dev.equals("devision") && num2==0){
            request.setAttribute("rez", "делить на ноль нельзя");
        }
        else{
            int rez = rezult(num1, num2, dev);
            request.setAttribute("rez", rez);
        }


        getServletContext().getRequestDispatcher("/Calculate.jsp").forward(request, response);
    }

    private int rezult(int num1, int num2, String dev){
        int rez = 0;
        switch (dev){
            case "sum":
                rez = num1+num2;
                break;
            case "minus":
                rez = num1-num2;
                break;
            case "multiple":
                rez = num1*num2;
                break;
            case "devision":
                rez = num1/num2;
                break;
            case "procent":
                rez = (num1*num2)/100;
                break;
            case "stepen":
                rez = (int)Math.pow(num1, num2);
                break;
        }

        return rez;
    }
}
