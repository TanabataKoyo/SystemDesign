package control;


import dao.AnswerDao;
import model.Answer;
import model.Question;


import java.sql.Connection;

public class AnswerManager {

    private Connection connection = null;

    public AnswerManager() {

    }

    public void reply(Answer answer,Question question) {

        //  StudentDAOオブジェクト生成
        AnswerDao answerDao = new AnswerDao();

        //  DataBaseへ接続し、コネクションオブジェクトを生成する
        this.connection = answerDao.createConnection();

        //  ResponseオブジェクトをDataBaseに登録する
        answerDao.reply(answer, question,this.connection);

        //  DataBaseとの接続を切断する
        answerDao.closeConnection(this.connection);

        //  コネクションオブジェクトを破棄する
        this.connection = null;

    }
}
