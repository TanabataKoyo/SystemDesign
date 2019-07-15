package control;

import dao.FindDao;
import model.Question;

import java.sql.Connection;


public class FindManager {

    private Connection connection = null;

    public FindManager() {

    }

    public Question find(Question question) {

        FindDao findDao = new FindDao();

        this.connection = findDao.createConnection();

//        findDao.find(question,this.connection);

//        findDao.createConnection();

        question = findDao.find(question,this.connection);

        this.connection = null;

        return question;
    }
}
