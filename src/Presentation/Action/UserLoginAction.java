package Presentation.Action;

import BusinessLogic.LoginLogic;
import Entity.Users;
import Exception.*;

import javax.servlet.http.HttpServletRequest;

public class UserLoginAction {
    public String execute(HttpServletRequest request) {
        String page = "/login.jsp";

        String userLoginName = request.getParameter("userLoginName");
        String userLoginPassword = request.getParameter("userLoginPassword");

        if ( userLoginName.equals("") || userLoginPassword.equals("") ) {
            request.setAttribute("message", "ログインIDまたはパスワードが間違っています。");
            return page;
        }

        try {
            LoginLogic loginLogic = new LoginLogic();
            Users users = loginLogic.login(userLoginName, userLoginPassword);
            request.setAttribute("users", users);
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
