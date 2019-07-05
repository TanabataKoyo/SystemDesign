//　自分が格納されているフォルダ名
package control;

//  自分が格納されているフォルダの外にある必要なクラス
import java.sql.Connection;

import dao.UsersDao;
import model.User;

public class UserManager {

    //  属性
    private Connection connection = null;

    //  引数を持たないコンストラクタ
    public UserManager(){
    }

    //  追加
    //  引数はStudentオブジェクト
    public void entry(User user){

        //  StudentDAOオブジェクト生成
        UsersDao usersDao = new UsersDao();

        //  DataBaseへ接続し、コネクションオブジェクトを生成する
        this.connection = usersDao.createConnection();

        //  StudentオブジェクトをDataBaseに登録する
        usersDao.entry(user, this.connection);

        //  DataBaseとの接続を切断する
        usersDao.closeConnection(this.connection);

        //  コネクションオブジェクトを破棄する
        this.connection = null;

    }
}
