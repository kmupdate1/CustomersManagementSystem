package Integration.DAO;

import Entity.Customer;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class CustomersDAO {
    private Connection connection;

    public CustomersDAO(Connection connection) {
        this.connection = connection;
    }

    public Customer getCustomer(String customersName) throws SQLException{
        ResultSet resultSet = null;
        PreparedStatement statement = null;
        Customer customer = null;
        String sql = "SELECT * FROM customers WHERE customers_name = ?";

        try {
            statement = connection.prepareStatement(sql);
            statement.setString(1, customersName);
            resultSet = statement.executeQuery();

            customer = new Customer();
            while ( resultSet.next() ) {
                // 存在しないカラムがあった場合の考慮も必要
                customer.setCustomersId(resultSet.getInt(1));
                customer.setCustomersName(resultSet.getString(2));
                customer.setCustomersAge(resultSet.getInt(3));
                customer.setCustomersBirthday(resultSet.getDate(4));
                customer.setCustomersZip(resultSet.getString(5));
                customer.setCustomersAddress(resultSet.getString(6));
                customer.setCustomersPhone(resultSet.getString(7));
                customer.setCustomersCreatedAt(resultSet.getDate(8));
                customer.setCustomersUpdatedAt(resultSet.getDate(9));
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
        return customer;
    }
}
