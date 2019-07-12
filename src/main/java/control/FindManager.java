package control;

import dao.PrintDao;
import model.Question;

import java.sql.Connection;


public class PrintManager {

    private Connection connection = null;

    public PrintManager() {

    }

    public Question print(Question question) {

        PrintDao printDao = new PrintDao();

        this.connection = printDao.createConnection();

        printDao.print(question,this.connection);

        printDao.createConnection();

        this.connection = null;

        return question;
    }
}
