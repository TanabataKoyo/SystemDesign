package dao;

import model.Question;

import java.sql.*;

public class QuestionDao {

        private final static String DRIVER_URL = "jdbc:mysql://localhost:3306/question_system?useUnicode=true&characterEncoding=UTF-8&useSSL=false";
        private final static String DRIVER_NAME = "com.mysql.jdbc.Driver";
        private final static String USER_NAME = "root";
        private final static String PASSWORD = "";

        public Connection createConnection(){
            try{
                Class.forName(DRIVER_NAME);
                Connection con = DriverManager.getConnection(DRIVER_URL, USER_NAME, PASSWORD);
                return con;
            } catch(ClassNotFoundException e){
                System.out.println("Can't Find JDBC Driver.\n");

            } catch(SQLException e){
                System.out.println("Connect Error.\n");
            }
            return null;
        }

        public void closeConnection(Connection con){

            try{
                con.close();
            }catch(Exception ex){}
        }

        public void add(Question question, Connection connection){

            try{

                //  SQLコマンド
                String sql = "insert into question(question_item_id,author_id,question_item) value(?, ?, ?)";

                //  SQLコマンドの実行
                PreparedStatement stmt = connection.prepareStatement(sql);

                //  SQLコマンドのクエッションマークに値を、1番目から代入する
                stmt.setString(3, question.getQuestionItem());
                stmt.setInt(2,question.getUserId());
                stmt.setInt(1,question.getQuestionItemId());




                stmt.executeUpdate();

            }catch(SQLException e){

//			エラーが発生した場合、エラーの原因を出力する
                e.printStackTrace();

            }
        }

    public Question find(Question question, Connection connection){

        try{

            //  SQLコマンド
            String sql = "select * from question where author_id = ? ";
            PreparedStatement stmt = connection.prepareStatement(sql);

//            stmt.setInt(2,question.getQuestionItemId());
            stmt.setInt(1,question.getUserId());
            //  SQLのコマンドを実行する
            //  実行結果はrsに格納される
            ResultSet rs =  stmt.executeQuery();

            rs.first();

            //  rsからそれぞれの情報を取り出し、Questionオブジェクトに設定する
            question.setUserId(rs.getInt("author_id"));
            question.setQuestionItem(rs.getString("question_item"));
            question.setQuestionItemId(rs.getInt("question_item_id"));
            //  終了処理
            stmt.close();
            rs.close();

            //  Studentオブジェクトを返す
            return question;

        }catch(SQLException e){

            //	エラーが発生した場合、エラーの原因を出力し、nullオブジェクトを返す
            e.printStackTrace();
            return null;

        }finally{

        }
    }
}
