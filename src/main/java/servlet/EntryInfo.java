package servlet;


import control.UserManager;
import model.User;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;


@WebServlet("/EntryInfo")

    public class EntryInfo extends HttpServlet{

    private static final long serialVersionUID = 1L;

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("UTF-8");

        RequestDispatcher dispatcher = request.getRequestDispatcher("/WEB-INF/home.jsp");
        dispatcher.forward(request,response);


    }
    public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
        // requestオブジェクトの文字エンコーディングの設定
        request.setCharacterEncoding("UTF-8");



        String name = request.getParameter("name");
        int id =   Integer.parseInt(request.getParameter("id"));

        User user = new User(name,id);
        System.out.println("id"+user.getId());
        UserManager manager = new UserManager();


        manager.entry(user);

        //成功画面を表示
        System.out.println("登録完了");
        RequestDispatcher dispatcher = request.getRequestDispatcher("/WEB-INF/EntryUserSuccess.jsp");
        dispatcher.forward(request,response);
    }
}
