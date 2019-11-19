package Presentation;

import Presentation.Action.SearchCustomerAction;
import Presentation.Action.UserLoginAction;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "FrontControllerServlet")
public class FrontControllerServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String page = null;

        request.setCharacterEncoding("UTF-8");
        String buttonID = request.getParameter("BUTTON_ID");

        if ( buttonID == null ) {
            buttonID = "101_01_01";
        }

        switch ( buttonID ) {
            case "後から決める0":
                SearchCustomerAction searchCustomerAction = new SearchCustomerAction();
                page = searchCustomerAction.execute(request);
                break;

            case "101_01_01":
                UserLoginAction userLoginAction = new UserLoginAction();
                page = userLoginAction.execute(request);
                break;

            case "後から決める2":
                page = "ページのURL2";
                break;

            case "901_01_01":
                page = "/errorView.jsp";
                break;
        }

        RequestDispatcher requestDispatcher = request.getRequestDispatcher(page);
        requestDispatcher.forward(request, response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request, response);
    }
}
