package Presentation.Action;

import BusinessLogic.LoginLogic;
import Entity.Users;
import Exception.*;

import javax.servlet.http.HttpServletRequest;

public class UserLoginAction {
    public String execute(HttpServletRequest request) {
        String page = "/login.jsp";

        String usersLoginName = request.getParameter("usersLoginName");
        String usersLoginPassword = request.getParameter("usersLoginPassword");

        if ( usersLoginName.equals("") || usersLoginPassword.equals("") ) {
            //request.setAttribute("message", "ログインIDまたはパスワードが間違っています。");
            request.setAttribute("message", "ログインまたはパスワードが未入力です。");
            return page;
        }

        try {
            LoginLogic loginLogic = new LoginLogic();
            Users users = loginLogic.login(usersLoginName, usersLoginPassword);
            request.setAttribute("usersName", users);
            page = "/loginResult.jsp";
        } catch (SalesBusinessException e) {
            e.printStackTrace();
            request.setAttribute("message", e.getMessage());
            page = "/errorView.jsp";
        } catch (SalesSystemException e) {
            e.printStackTrace();
            request.setAttribute("message", e.getMessage());
            page = "/errorView.jsp";
        }
        return page;
    }
}
