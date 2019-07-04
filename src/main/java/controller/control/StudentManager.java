package controller.control;

import dao.UsersDao;
import model.User;

import java.sql.Connection;

public class StudentManager {

    private Connection connection = null;

    public StudentManager(){

    }

    public void entry(User user) {

        //usersDaoのオブジェクト生成
        UsersDao usersDao = new UsersDao();

        //DBに接続しコネクションオブジェクトを生成
        this.connection = usersDao.createConnection();

        //usersオブジェクトをDBに登録
        usersDao.entry(user, this.connection);

        usersDao.closeConnection(this.connection);

        this.connection = null;
    }
}
