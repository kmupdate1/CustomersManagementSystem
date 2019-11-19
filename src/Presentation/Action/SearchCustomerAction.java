package Presentation.Action;

import BusinessLogic.SearchCustomerLogic;
import Entity.Customer;
import Exception.SalesBusinessException;
import Exception.SalesSystemException;

import javax.servlet.http.HttpServletRequest;

public class SearchCustomerAction {
    public String execute(HttpServletRequest request) {
        String page = "/SearchCustomerView.jsp";

        String customerName = request.getParameter("CUSTOMER_NAME");

        if ( customerName != null ) {
            request.setAttribute("message", "お客様IDが未入力です。");
            return page;
        }

        try {
            SearchCustomerLogic logic = new SearchCustomerLogic();
            Customer customer = logic.searchCustomer(customerName);

            request.setAttribute("Customer", customer);

            page = "/ResultCustomerView.jsp";

        } catch (SalesBusinessException e) {
            e.printStackTrace();
            request.setAttribute("message", e.getMessage());
        } catch (SalesSystemException e) {
            e.printStackTrace();
            request.setAttribute("message", e.getMessage());
            page = "/SalesErrorView.jsp";
        }
        return page;
    }
}
