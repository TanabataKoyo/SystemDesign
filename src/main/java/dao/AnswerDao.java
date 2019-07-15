package dao;

import model.Answer;
import model.Question;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class AnswerDao {

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

    public void reply(Answer answer,Question question, Connection connection){

        try{

            //  SQLコマンド
            String sql = "insert into answer(question_item_id,respondent_id,question_item,author_id,answer_content,answer_rank) value(?, ?, ?, ?, ?, ?)";

            //  SQLコマンドの実行
            PreparedStatement stmt = connection.prepareStatement(sql);

            //  SQLコマンドのクエッションマークに値を、1番目から代入する
            stmt.setInt(6,answer.getAnswerRank());
            stmt.setString(5,answer.getAnswerContent());
            stmt.setInt(4, question.getUserId());
            stmt.setString(3, answer.getAnswerContent());
            stmt.setInt(2,answer.getRespondentId());
            stmt.setInt(1,question.getQuestionItemId());



            stmt.executeUpdate();

        }catch(SQLException e){

//			エラーが発生した場合、エラーの原因を出力する
            e.printStackTrace();

        }
    }
}