package controller.users;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;


@WebServlet("/Entry")
public class Entry extends HttpServlet {

    private static final long serialVersionUID = 1L;

    public Entry() {
        super();
    }

    //get
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        request.setCharacterEncoding("UTF-8");

        //request.setAttribute("",);
        RequestDispatcher dispatcher = request.getRequestDispatcher("/WEB-INF/entry.jsp");
        dispatcher.forward(request, response);

    }

    //post
        protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
            request.setCharacterEncoding("UTF-8");

            //request.setAttribute("",);
            RequestDispatcher dispatcher = request.getRequestDispatcher("/WEB-INF/home.jsp");
            dispatcher.forward(request, response);
    }

}