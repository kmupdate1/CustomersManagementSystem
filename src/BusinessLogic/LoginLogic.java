package BusinessLogic;

import Entity.Users;
import Exception.SalesBusinessException;
import Exception.SalesSystemException;
import Integration.DAO.UsersDAO;
import Integration.DBConnectionManager;

import java.sql.Connection;
import java.sql.SQLException;

public class LoginLogic {
    public Users login(String userLoginName, String userLoginPassword) throws SalesBusinessException, SalesSystemException {
        Connection connection = null;
        Users users = null;

        try {
            connection = DBConnectionManager.getConnection();

            UsersDAO usersDAO = new UsersDAO(connection);
            users = usersDAO.findUsers(userLoginName, userLoginPassword);

            if ( users == null ) {
                throw new SalesBusinessException("入力したユーザ情報が存在しません。");
            }
        } catch (SQLException e) {
            e.printStackTrace();
            throw new SalesSystemException("システムエラーが発生しました。システム管理者に連絡してください。<br>連絡先:080-4303-6523");
        } finally {
            try {
                if ( connection != null ) {
                    connection.close();
                }
            } catch (SQLException e) {
                e.printStackTrace();
                throw new SalesSystemException("システムエラーが発生しました。システム管理者に連絡してください。<br>連絡先:080-4303-6523");
            }
        }
        return users;
    }
}
