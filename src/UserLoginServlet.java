

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class UserLoginServlet
 */
@WebServlet("/UserLoginServlet")
public class UserLoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public UserLoginServlet() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doPost(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            String email = request.getParameter("email");
            String password = request.getParameter("password");
            
            try{
                if(email!=null)
                {
                	Class.forName("com.mysql.jdbc.Driver");
                    java.sql.Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/pawsfinder?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC","root","");
                    
                    String query = "select * from usertbl where userEmailID=? and userPassword=?";
                    PreparedStatement psm = con.prepareStatement(query);
                    psm.setString(1, email);
                    psm.setString(2, password);
                    ResultSet rs = psm.executeQuery();
                    if(rs.next()) 
                    {
                    	
                        String id = rs.getString(1);
                        HttpSession session = request.getSession(true);
                        session.setAttribute("id", id);
                        session.setAttribute("firstName",rs.getString("firstName"));
                        session.setAttribute("userPhone",rs.getString("userPhone"));
                        session.setAttribute("userCity",rs.getString("userCity"));
                        //int id= rs.getInt(1);
                       //HttpSession session = request.getSession(true);
                       //session.setAttribute("id", id);
                        response.sendRedirect("index.jsp");
                        System.out.println("fdgttg");
                    }
                    else
                    {
                        out.println("<script type=\"text/javascript\">");
                        out.println("alert('Login failed. Try again!');");
                        out.println("location='Login.jsp';");
                        out.println("</script>");
                    }
                }
            }
            catch (SQLException e) {
                System.out.println("Error Executing SQL statement: " + e.getMessage());
            }
            catch (ClassNotFoundException e) {
                System.out.println("Driver Not Found: " + e.getMessage());
            }
            catch(Exception e)
            {
                out.println("Exception:" + e.getMessage());
            }       
        }
	}

}
