package Integration.DAO;

import Entity.Items;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class ItemsDAO {
    private Connection connection;

    private ItemsDAO(Connection connection) {
        this.connection = connection;
    }

    public Items findItems(int itemsId) throws SQLException {
        String sql = "SELECT * FROM items WHERE items_id = ?";
        PreparedStatement statement = null;
        ResultSet resultSet = null;
        Items items = null;

        try {
            statement = connection.prepareStatement(sql);
            statement.setInt(1, itemsId);
            resultSet = statement.executeQuery();

            if ( resultSet.next() ) {
                items = new Items();
                items.setItemsId(resultSet.getInt(1));
                items.setItemsName(resultSet.getString(2));
                items.setItemsPrice(resultSet.getInt(3));
                items.setItemsCreatedAt(resultSet.getDate(4));
                items.setItemsUpdatedAt(resultSet.getDate(5));
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
        return items;
    }
}
