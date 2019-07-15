package servlet;


import control.AnswerManager;
import model.Answer;
import model.Question;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/ReplyInfo")

public class ReplyInfo extends HttpServlet {

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("UTF-8");
        RequestDispatcher dispatcher = request.getRequestDispatcher("/WEB-INF/home.jsp");
        dispatcher.forward(request, response);

    }

    public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // requestオブジェクトの文字エンコーディングの設定
        request.setCharacterEncoding("UTF-8");

        String AnswerContent= request.getParameter("AnswerContent");
        int QuestionItemId = Integer.parseInt(request.getParameter("QuestionItemId"));
        int RespondentId = Integer.parseInt(request.getParameter("id"));
        int AnswerRank = Integer.parseInt(request.getParameter("AnswerRank"));
        String QuestionItem = null;
//        request.getParameter("QuestionItem");
        int UserId = Integer.parseInt(request.getParameter("UserId"));

        Answer answer = new Answer(RespondentId,AnswerContent,AnswerRank);
        Question question = new Question(QuestionItem,QuestionItemId,UserId);
        AnswerManager manager = new AnswerManager();


        manager.reply(answer,question);

        RequestDispatcher dispatcher = request.getRequestDispatcher("/WEB-INF/home.jsp");
        dispatcher.forward(request, response);


    }
}
