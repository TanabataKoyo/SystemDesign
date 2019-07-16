package control;

import dao.QuestionDao;
import model.Question;

import java.sql.Connection;

public class QuestionManager {
    //  属性
    private Connection connection = null;

    //  引数を持たないコンストラクタ
    public QuestionManager() {

    }

    //  追加
    //  引数はUserオブジェクト
    public void add(Question question) {

        //  StudentDAOオブジェクト生成
        QuestionDao questionDao = new QuestionDao();

        //  DataBaseへ接続し、コネクションオブジェクトを生成する
        this.connection = questionDao.createConnection();

        //  StudentオブジェクトをDataBaseに登録する
        questionDao.add(question, this.connection);

        //  DataBaseとの接続を切断する
        questionDao.closeConnection(this.connection);

        //  コネクションオブジェクトを破棄する
        this.connection = null;

    }

    public Question find(Question question) {

        QuestionDao questionDao = new QuestionDao();

        this.connection = questionDao.createConnection();

//        findDao.find(question,this.connection);

//        findDao.createConnection();

        question = questionDao.find(question,this.connection);

        this.connection = null;

        return question;
    }
}
