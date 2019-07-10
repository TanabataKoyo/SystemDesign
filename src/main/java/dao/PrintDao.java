package dao;

import java.sql.*;
import java.util.List;

public class ListDao {
    private final static String DRIVER_URL = "jdbc:mysql://localhost:3306/question_system?useUnicode=true&characterEncoding=UTF-8&useSSL=false";
    private final static String DRIVER_NAME = "com.mysql.jdbc.Driver";
    private final static String USER_NAME = "root";
    private final static String PASSWORD = "";

    public Connection createConnection() {
        try {
            Class.forName(DRIVER_NAME);
            Connection con = DriverManager.getConnection(DRIVER_URL, USER_NAME, PASSWORD);
            return con;
        } catch (ClassNotFoundException e) {
            System.out.println("Can't Find JDBC Driver.\n");

        } catch (SQLException e) {
            System.out.println("Connect Error.\n");
        }
        return null;
    }

    public List list(Student student, Connection connection){

        try{

            //  SQLコマンド
            String sql = "select * from answer where student_id = '" + student.getStudentID() + "'";

            //  SQLのコマンドを実行する
            //  実行結果はrsに格納される
            Statement stmt = connection.createStatement();
            ResultSet rs = stmt.executeQuery(sql);

            rs.first();

            //  rsからそれぞれの情報を取り出し、Studentオブジェクトに設定する
            student.setStudentName(rs.getString("student_name"));
            student.setStudentBirthplace(rs.getString("student_birthplace"));

            //  終了処理
            stmt.close();
            rs.close();

            //  Studentオブジェクトを返す
            return student;

        }catch(SQLException e){

            //	エラーが発生した場合、エラーの原因を出力し、nullオブジェクトを返す
            e.printStackTrace();
            return null;

        }finally{
        }
    }

}

}
