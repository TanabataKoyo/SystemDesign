package model;

public class User {
    private int id;
    private String name;

    //空のコンストラクタを作成；user作成時に最初に用意しておく用
    public void user() {

    }
    //コンストラクタ
    public void user(int id,String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getErrorMessage() {
        String actual = "userNameは必須項目です.";
        return actual;
    }
}