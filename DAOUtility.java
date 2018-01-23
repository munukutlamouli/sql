package com.ts.us.utility;

import java.sql.*;



public class DAOUtility {
    static Connection con;

    
    // step1:register the driver
    static {
         try {
                DriverManager.registerDriver(new com.mysql.jdbc.Driver());
                System.out.println("registered with driver");
                String url = "jdbc:mysql://localhost:3306/urbanspoon";
                String uname = "root";
                String pwd = "root";
              con = DriverManager.getConnection(url, uname, pwd);
                System.out.println("we got the connection"+con);
            } catch (SQLException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
                
          }
          public static Connection getConn() {
              return con;
          }

}