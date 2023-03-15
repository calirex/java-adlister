import com.mysql.cj.jdbc.Driver;

import java.sql.*;

public class JDBCExample {
    public static void main(String[] args) {

        try {
            DriverManager.registerDriver(new Driver());

            // Register driver
            DriverManager.registerDriver(new Driver());


            // make the connection
            Connection connection = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/codeup_test_db?allowPublicKeyRetrieval=true&useSSL=false",
                    "root",
                    "codeup"
            );

            // Create a statement
//            System.out.println(connection);
            Statement stmt = connection.createStatement();

            // run query with statement and parse result set
            String query = "select * from albums;";

            ResultSet rs = stmt.executeQuery(query);

            if (rs.next()){
                System.out.println(rs.getString("artist"));
            }

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

    }
}
