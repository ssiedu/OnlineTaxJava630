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
        PrintWriter pw=response.getWriter();
        pw.println("Thanks For Visiting Us.");
        pw.println("Your Tax Liability Is : "+tax);
        pw.println("Pay Your Taxes Before 31st March");
        pw.close();
        
    }

    
    
}
