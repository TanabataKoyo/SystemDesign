package model;

public class User {
    private Integer id;
    private String name;

    //空のコンストラクタを作成；user作成時に最初に用意しておく用
    public void user() {


    }
    //コンストラクタ
    public  User(String name,Integer id) {
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
}