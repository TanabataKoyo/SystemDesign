 package dao;

 import java.sql.Connection;
 import java.sql.PreparedStatement;
 import java.sql.SQLException;
 import utility.DriverAccessor;

 public class UsersDao extends DriverAccessor {

     //CRUDのSQL文
     public static final String getById = "select * from users where user_id = ?"; //IDを引数にユーザを取得するSQL文
     public static final String getByName = "select * from users where name = ?"; //ユーザ名を引数にユーザを取得するSQL文
     public static final String entry = "insert into users(name,id)values(?,?)"; //ユーザ登録のSQL文
     public static final String update = "update users set name = ?,id = ? where user_id = ?"; //ユーザ情報更新のSQL文






     //Entry
     public void entry (String userName, Integer studentId, Connection connection) {
         try {

             PreparedStatement statement = connection.prepareStatement(entry);
             statement.setString(1, userName);
             statement.setInt(2, studentId);
             statement.executeUpdate();
             statement.close();
         } catch (SQLException e) {
             e.printStackTrace();
         }
     }
 }
