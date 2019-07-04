package dao;

import model.Post;
import utility.DriverAccessor;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class PostDao extends DriverAccessor {

    public static final String entry = "insert into posts(name,id) values (?,?);";

    public void entry(Post post, Connection connection) {
        try {
            PreparedStatement statement = connection.prepareStatement(entry);

            statement.setString(1,post.getUserName());
            statement.setString(2,post.getStudentId());

            statement.executeUpdate();
            statement.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
