package Integration;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnectionManager {
    private static final String URL = "jdbc:mysql://localhost:3306/WatajuCustomerManagement";
    private static final String USER_NAME = "root";
    private static final String USER_PASSWORD = "password";

    public static Connection getConnection() throws SQLException {
        Connection connection = null;
        try {
            connection = DriverManager.getConnection(URL, USER_NAME, USER_PASSWORD);
        } catch (SQLException e) {
            e.printStackTrace();
            throw e;
        }
        return connection;
    }

}
