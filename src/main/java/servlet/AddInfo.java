package servlet;

import control.QuestionManager;
import model.Question;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/AddInfo")

public class AddInfo extends HttpServlet {

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("UTF-8");

        RequestDispatcher dispatcher = request.getRequestDispatcher("/WEB-INF/home.jsp");
        dispatcher.forward(request, response);


    }

    public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // requestオブジェクトの文字エンコーディングの設定
        request.setCharacterEncoding("UTF-8");


        String QuestionItem = request.getParameter("QuestionItem");
        int QuestionItemId = Integer.parseInt(request.getParameter("QuestionItemId"));
        int UserId = Integer.parseInt(request.getParameter("UserId"));

        Question question = new Question(QuestionItem,QuestionItemId,UserId);
        System.out.println("item"+question.getQuestionItem());
        QuestionManager manager = new QuestionManager();


        manager.add(question);

        //成功画面を表示
        System.out.println("登録完了");
        RequestDispatcher dispatcher = request.getRequestDispatcher("/WEB-INF/home.jsp");
        dispatcher.forward(request,response);
    }
}