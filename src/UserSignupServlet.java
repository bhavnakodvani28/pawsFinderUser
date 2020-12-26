

import java.db.jdbc.DBConfig;
import java.db.jdbc.DBConnection;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class UserSignupServlet
 */
@WebServlet("/UserSignupServlet")
public class UserSignupServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public UserSignupServlet() {
        // TODO Auto-generated constructor stub
    }

    private void processRequest(HttpServletRequest request, HttpServletResponse response) throws IOException {
		// TODO Auto-generated method stub
		response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            String firstName = request.getParameter("fname");
            String lastName = request.getParameter("lname");
            String userDOB = request.getParameter("DOB");
            String userEmailID = request.getParameter("email");
            String userPhone = request.getParameter("Phone");
            String userPostalCode = request.getParameter("postalcode");
            String userCity = request.getParameter("city");
            String userPassword = request.getParameter("password");
            
            System.out.println(firstName);
            int status =0;
            try{
            	Class.forName("com.mysql.jdbc.Driver");
                java.sql.Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/pawsfinder?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC","root","");

                    String query = "insert into usertbl(firstName,lastName,userDOB,userEmailID,userPhone,userPostalCode,userCity,userPassword) values (?,?,?,?,?,?,?,?)";
                    PreparedStatement psm = con.prepareStatement(query);
                    psm.setString(1, firstName);
                    psm.setString(2, lastName);
                    psm.setString(3, userDOB);
                    psm.setString(4, userEmailID);
                    psm.setString(5, userPhone);
                    psm.setString(6, userPostalCode);
                    psm.setString(7, userCity);
                    psm.setString(8, userPassword);
                    status = psm.executeUpdate();
                    
                    if(status == 1)
                    {
                        response.sendRedirect("index.jsp");
                    }
                    else{
                        out.println("<script type=\"text/javascript\">");
                        out.println("alert('Signup Failed!');");
                        out.println("location='Signup.jsp';");
                        out.println("</script>");
                    }
                    con.close();
            }
            
            catch(Exception e)
            {
            	out.print(e.toString());
            	}
            }

		
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		processRequest(request, response);
	}

	
	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		processRequest(request, response);
	}
	
	@Override
    public String getServletInfo() {
        return "Short description";
    }

}
