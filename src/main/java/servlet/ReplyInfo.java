package servlet;


import control.AnswerManager;
import model.Answer;
import model.Question;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class ResponsingInfo extends HttpServlet {

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("UTF-8");

        RequestDispatcher dispatcher = request.getRequestDispatcher("/WEB-INF/home.jsp");
        dispatcher.forward(request, response);


    }

    public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // requestオブジェクトの文字エンコーディングの設定
        request.setCharacterEncoding("UTF-8");

        String AnswerContent= request.getParameter("AnswerContent");
        int QuestionId = Integer.parseInt(request.getParameter("QuestionId"));
        int RespondentId = Integer.parseInt(request.getParameter("RespondentId"));

        Answer answer = new Answer(AnswerContent,QuestionId,RespondentId);
        AnswerManager manager = new AnswerManager();

        manager.responsing(answer);

        //成功画面を表示
        RequestDispatcher dispatcher = request.getRequestDispatcher("/WEB-INF/home.jsp");
        dispatcher.forward(request,response);
    }
}
