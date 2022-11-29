package cWH;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class JDBC_Connection {
    public static void main(String[] args) throws  Exception {
        String query = "show databases;";
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/Project", "admin", "Project@112");
        Statement st = con.createStatement();
        ResultSet rs =   st.executeQuery(query);


      while( rs.next()) {
          String name = rs.getString("name");

          System.out.println(name);

      }
        st.close();
        con.close();
    }
}
