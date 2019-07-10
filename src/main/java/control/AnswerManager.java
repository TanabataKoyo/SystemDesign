package control;


import dao.ResponsingDao;
import users.Responsing;

import java.sql.Connection;

public class ResponsingManager {

    private Connection connection = null;

    public ResponsingManager() {

    }

    public void response(Responsing responsing) {

        //  StudentDAOオブジェクト生成
        ResponsingDao responsingDao = new ResponsingDao();

        //  DataBaseへ接続し、コネクションオブジェクトを生成する
        this.connection = responsingDao.createConnection();

        //  ResponseオブジェクトをDataBaseに登録する
        responsingDao.responsing(responsing, this.connection);

        //  DataBaseとの接続を切断する
        responsingDao.closeConnection(this.connection);

        //  コネクションオブジェクトを破棄する
        this.connection = null;

    }
}
