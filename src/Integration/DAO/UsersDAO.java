package Integration.DAO;

import Entity.Users;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class UsersDAO {
    private Connection connection;

    public UsersDAO(Connection connection) {
        this.connection = connection;
    }

    public Users findUsers(String usersLoginName, String usersLoginPassword) throws SQLException {
        String sql = "SELECT * FROM users WHERE users_login_name = ? AND users_login_password = ?";
        PreparedStatement statement = null;
        ResultSet resultSet = null;
        Users users = null;

        try {
            statement = connection.prepareStatement(sql);
            statement.setString(1, usersLoginName);
            statement.setString(2, usersLoginPassword);
            resultSet = statement.executeQuery();

            //ここ分からんからちょっと保留
            while ( resultSet.next() ) {
                users = new Users();
                users.setUsersId(resultSet.getInt(1));
                users.setUsersLoginName(resultSet.getString(2));
                users.setUsersLoginPassword(resultSet.getString(3));
                users.setUsersName(resultSet.getString(4));
                users.setUsersAge(resultSet.getInt(5));
                users.setUsersBirthday(resultSet.getDate(6));
                users.setUsersCreatedAt(resultSet.getDate(7));
                users.setUsersUpdatedAt(resultSet.getDate(8));
            }
        } catch (SQLException e) {
            e.printStackTrace();
            throw e;
        } finally {
            if ( resultSet != null ) {
                resultSet.close();
            }
            if ( statement != null ) {
                statement.close();
            }
        }
        return users;
    }
}
