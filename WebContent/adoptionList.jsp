<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>

<%@page import="java.db.jdbc.DBConfig"%>
<%@page import="java.db.jdbc.DBConnection"%>
<%@page import="java.sql.Statement"%>
<%@ page import = "java.sql.*"%>
<%@ page import = "javax.sql.*"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<center>
<table style="width:100%" border="1" style="border-color:#fbb448">

                <%
                    
                Class.forName("com.mysql.jdbc.Driver");
                java.sql.Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/pawsfinder?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC","root","");
                Statement st = con.createStatement();
                    
                    
                    ResultSet rs= st.executeQuery("select dogName,dogAge,gender,breed,price from dogtbl");
                %>
                    <tr>
                        <th>Name</th>
                        <th>Age</th>
                        <th>Gender</th>
                        <th>Breed</th>
                        <th>Price</th>                       
                    </tr>
                    <%
                        while(rs.next())
                        {
                    %>
                        <tr>
                            <td><%=rs.getString(1)%></td>
                            <td><%=rs.getInt(2)%></td>
                            <td><%=rs.getString(3)%></td>
                            <td><%=rs.getString(4)%></td>
              <td><%=rs.getFloat(5)%></td>
              
                        </tr>
                    <%
                        }
                    %>
                </table>
</body>
</html>