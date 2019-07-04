package servlet;


import controller.control.StudentManager;
import model.User;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/EntryInfo")

    public class EntryInfo extends HttpServlet{

    private static final long serialVersionUID = 1L;

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws SecurityException, IOException{
        request.setCharacterEncoding("UTF-8");


        String userName = request.getParameter("userName");
        Integer studentId = request.getIntHeader("studentId");

        User user = new User(userName, studentId);

        StudentManager manager = new StudentManager();

        manager.entry(user);

        //成功画面を表示
        System.out.println("登録完了");
        response.sendRedirect("/Question_System/EntryInfo");
    }
}
