import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;

public class ServletText extends HttpServlet{
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        String s = request.getParameter("text");
        //System.out.println("Пришла строка - "+s+" - "+(int)s.charAt(1));
        ArrayList<ArrayList<String>> ars = new ArrayList<>();
        ars = dev_letter(s);
        int gl = ars.get(0).size();
        int punkt = ars.get(1).size();
        int sogl = ars.get(2).size();


        request.setAttribute("gl", gl);
        request.setAttribute("gl_list",ars.get(0));
        request.setAttribute("punkt", punkt);
        request.setAttribute("punkt_list",ars.get(1));
        request.setAttribute("sogl", sogl);
        request.setAttribute("sogl_list",ars.get(2));

        getServletContext().getRequestDispatcher("/Text.jsp").forward(request, response);
    }

//
    private ArrayList<ArrayList<String>> dev_letter(String s){
        int mas_gl[] = {65,69,73,79,85,89,97,101,105,111,117,121,1025 ,1025,1040,1045,1048,1054,1059,1067,
                1069,1070,
                1071,1072,1077,1080 ,1086,1091,1099 ,1101,1102,1103};

        int mas_sogl[] = {66,67,68,70,71,72,74,75,76,77,78,80,81,82,83,84,86,87,88,90,98,99,100,102,103,
        104,106,107,108,109,110,112,113,114,115,116,118,119,120,122,193,194,195,196,198,199,201,202,
                203,204,205,207,208,209,210,212,213,214,215,216,217,218,220,225,226,227,228,230,231,233,
        234,235,236,237,239,240,241,242,244,245,246,247,248,249,250,252};

        int mas_punkt[] = {33,44,45,46,58,59,63};

        ArrayList<String> ar_gl = new ArrayList<>();
        ArrayList<String> ar_sogl = new ArrayList<>();
        ArrayList<String> ar_punkt = new ArrayList<>();
        for(int i = 0; i<s.length(); i++){

            if(parsString(s.charAt(i), mas_gl, ar_gl)){
                continue;
            }

            if(parsString(s.charAt(i), mas_punkt, ar_punkt)){
                continue;
            }

            parsString(s.charAt(i), mas_sogl, ar_sogl);
        }
            ArrayList<ArrayList<String>> ars = new ArrayList<>();
            ars.add(ar_gl);
            ars.add(ar_punkt);
            ars.add(ar_sogl);
        return ars;
    }

    private boolean parsString(int a, int mas[], ArrayList<String> list){
        boolean bool = false;
        for(int j=0; j<mas.length-1;j++){

            if(a==mas[j]){
                //count_gl++;
                //добавить проверку на наличие такого символа в массиве
                list.add((char)a+"");
                bool=true;
                break;
            }
        }
        return bool;

    }


}
