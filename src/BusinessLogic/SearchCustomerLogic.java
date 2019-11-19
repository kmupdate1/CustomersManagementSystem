package BusinessLogic;

import Entity.Customer;

import java.sql.Connection;
import java.sql.SQLException;

import Exception.SalesBusinessException;
import Exception.SalesSystemException;
import Integration.DAO.CustomersDAO;
import Integration.DBConnectionManager;

public class SearchCustomerLogic {
    public Customer searchCustomer(String customersName) throws SalesBusinessException, SalesSystemException {

        Connection connection = null;
        Customer customer = null;

        try {
            connection = DBConnectionManager.getConnection();

            CustomersDAO customersDAO = new CustomersDAO(connection);
            customer = customersDAO.getCustomer(customersName);
            if (customer == null) {
                throw new SalesBusinessException("該当するお客様は、登録されていません。");
            }
        }catch (SQLException e) {
            e.printStackTrace();
            throw new SalesSystemException("システムエラーが発生しました。システム管理者に連絡してください。<br>連絡先:080-4303-6523");
        } finally {
            try {
                if (connection != null) {
                    connection.close();
                }
            } catch (SQLException e) {
                e.printStackTrace();
                throw new SalesSystemException("システムエラーが発生しました。システム管理者に連絡してください。<br>連絡先:080-4303-6523");
            }
        }
        return customer;
    }
}
