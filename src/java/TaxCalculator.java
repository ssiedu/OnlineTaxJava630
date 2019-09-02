import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class TaxCalculator extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //reads the request
        String s1=request.getParameter("t1");
        String s2=request.getParameter("t2");
        //processes the request
        int income=Integer.parseInt(s1);
        int age=Integer.parseInt(s2);
        int tax=0;
        if(income>=500000){
            tax=income*20/100;
        }else{
            tax=income*10/100;
        }
        //provides the response
        PrintWriter out=response.getWriter();
        
        out.println("<html>");
        out.println("<body bgcolor=pink>");
        out.println("<hr>");
        out.println("<h3>Income Tax Dept</h3>");
        out.println("<h4>Thanks For Visiting Us</h4>");
        out.println("<hr>");
        out.println("<table border=2>");
        out.println("<tr>");
        out.println("<td>Income</td>");
        out.println("<td>"+income+"</td>");
        out.println("</tr>");
        out.println("<tr>");
        out.println("<td>Age</td>");
        out.println("<td>"+age+"</td>");
        out.println("</tr>");
        out.println("<tr>");
        out.println("<td>Tax</td>");
        out.println("<td>"+tax+"</td>");
        out.println("</tr>");
        out.println("</table>");
        out.println("<hr>");
        out.println("<marquee>Be A Responsible Citizen. Pay Taxes On Time Honestly</marquee>");
        out.println("</body>");
        out.println("</html>");
        
        out.close();
        
    }

    
    
}
