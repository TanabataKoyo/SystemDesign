//package service;
//
//
//import dao.PostDao;
//
//import javax.servlet.http.HttpServlet;
//import java.sql.Connection;
//
//public class PostService extends HttpServlet{
//
//    private Connection connection = null;
//
//    private void createConnection(PostDao dao){
//        this.connection = dao.createConnection();
//    }
//
//    private void closeConnection(PostDao dao) {
//        dao.closeConnection(this.connection);
//        this.connection = null;
//    }
//}
