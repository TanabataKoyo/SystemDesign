package servlet;

import control.AnswerManager;
import model.Answer;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/SearchInfo")
public class SearchInfo extends HttpServlet {

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("UTF-8");

        RequestDispatcher dispatcher = request.getRequestDispatcher("/WEB-INF/home.jsp");
        dispatcher.forward(request, response);
    }

    public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // requestオブジェクトの文字エンコーディングの設定
        request.setCharacterEncoding("UTF-8");

        // requestオブジェクトから登録情報の取り出し
        int RespondentId = Integer.parseInt(request.getParameter("RespondentId"));
        int QuestionItemId = Integer.parseInt(request.getParameter("QuestionItemId"));

        AnswerManager manager = new AnswerManager();

        String AnswerContent = null;
        int AnswerRank = -1;

        Answer answer = new Answer(RespondentId, AnswerContent,AnswerRank,QuestionItemId);

        answer = manager.search(answer);

        request.setAttribute("Answer",answer);
        RequestDispatcher dispatcher = request.getRequestDispatcher("/WEB-INF/ShowAnswer.jsp");
        dispatcher.forward(request,response);
    }
}
