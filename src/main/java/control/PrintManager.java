package control;

import dao.ListDao;
import model.Question;

import java.sql.Connection;

public class ListManager {
    private Connection connection = null;

    public ListManager() {

    }

    public void list(Question question) {
        ListDao listDao = new ListDao();

        this.connection = listDao.createConnection();

        listDao.list(question,this.connection);

        listDao.closeConnection(this.connection);

        this.connection = null;
    }
}
