/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java.db.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author user
 */
public class DBConnection {
    private DBConnection() 
            throws ClassNotFoundException, SQLException {
       	
        Class.forName( DBConfig.DB_DRIVER );
        con = DriverManager.getConnection(
                DBConfig.DB_URL, 
                DBConfig.DB_USER, 
                DBConfig.DB_PWD );
    }
      
    public static DBConnection getInstance() throws ClassNotFoundException, SQLException {
        
        if(instance == null )
        {
            instance = new DBConnection();
        }
        return instance;
    }

    public static DBConnection getInstance(String dburl, String user, String pwd) throws ClassNotFoundException, SQLException {
        instance = new DBConnection();
        return instance;
    }    
    
    public Connection getConnection() throws SQLException{
        return con;
    }

    public Connection getConnectionSchema(String schema) throws SQLException{
    	con.setSchema(schema);
        return con;
    }

    public void close() throws SQLException{
        con.close();
        instance = null;
    }

    protected void finalize() throws Throwable {
        con.close();    	
    }
    
    private final Connection con;
    private static DBConnection instance = null;
}