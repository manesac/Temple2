
import com.temple.dao.RegisterDao;
import com.temple.model.Register;
import java.io.IOException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

//@WebServlet({"/register","/register/add"})
public class RegistrationController extends HttpServlet {


    

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
          String contextpath = request.getContextPath();
       if (request.getRequestURI().equals(contextpath + "/register")) {
            
            RequestDispatcher rd = request.getRequestDispatcher("register.jsp");
            rd.forward(request, response);
        }
        
        
    }

    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
         String contextPath = request.getContextPath();
        if (request.getRequestURI().equals(contextPath + "/register/add")) {
 String email = request.getParameter("email");
            String fname = request.getParameter("firstname");
            String lname = request.getParameter("lastname");
            String password = request.getParameter("password");
            String address = request.getParameter("address");

            //encapsulating the values
            Register r = new Register();
            r.setEmail(email);
            r.setFname(fname);
            r.setLname(lname);
            r.setPassword(password);
            r.setAddress(address);
            RegisterDao.insert(r);
           response.sendRedirect(contextPath + "/register");
        }
    }


}
