package Presentation;

import Presentation.Action.SearchCustomerAction;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "Login")
public class FrontControllerServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String page = null;

        request.setCharacterEncoding("UTF-8");
        String buttonID = request.getParameter("BUTTON_ID");

        if ( buttonID == null ) {
            buttonID = "後から決める";
        }

        switch ( buttonID ) {
            case "後から決める0":
                SearchCustomerAction action = new SearchCustomerAction();
                page = action.execute(request);
                break;

            case "後から決める1":
                page = "ページのURL1";
                break;

            case "後から決める2":
                page = "ページのURL2";
                break;

            case "後から決める3":
                page = "ページのURL3";
                break;
        }

        RequestDispatcher requestDispatcher = request.getRequestDispatcher(page);
        requestDispatcher.forward(request, response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request, response);
    }
}
