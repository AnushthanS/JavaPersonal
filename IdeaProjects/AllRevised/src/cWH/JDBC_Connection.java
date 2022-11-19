/* JAVA DATABASE CONNECTIVITY


1. IMPORT --> java.sql.*;
2. load and register the driver --> com.mysql.jdbc.Driver
3. create connection
4. create a statement
5. execute a query
6. process the results
7. close
 */

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

/*import java.sql.*;*/
public class JDBC_Connection {
    public static void main(String[] args) throws  Exception
    {
// String url = "jdbc:mysql://localhost:3306//jdbc";
// String username = "root";
// String password = "MDKRN@25";
        String query = "show databases;";
//       // Class.forName("com.mysql.jdbc.Drive");
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/Project", "admin", "Project@112");
//        Connection con = DriverManager.getConnection(url,username,password);
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
