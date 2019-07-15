package servlet;

import control.FindManager;
import model.Question;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/FindInfo")
public class FindInfo extends HttpServlet {

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("UTF-8");

        RequestDispatcher dispatcher = request.getRequestDispatcher("/WEB-INF/home.jsp");
        dispatcher.forward(request, response);
    }

    public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // requestオブジェクトの文字エンコーディングの設定
        request.setCharacterEncoding("UTF-8");

        // requestオブジェクトから登録情報の取り出し
        int userId = Integer.parseInt(request.getParameter("userId"));
        String QuestionItem = null;
        int QuestionItemId = Integer.parseInt(request.getParameter("QuestionItemId"));


        // studentのオブジェクトに情報を格納
        Question question = new Question(QuestionItem,QuestionItemId,userId);

        FindManager manager = new FindManager();

        question = manager.find(question);

        request.setAttribute("Question",question);
        RequestDispatcher dispatcher = request.getRequestDispatcher("/WEB-INF/reply.jsp");
        dispatcher.forward(request,response);
    }
}
