package model;

public class Post {
    private int studentId;
    private String userName;

    public Post(String userName,int studentId){

    }

    public Post() {

    }

    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }
}
