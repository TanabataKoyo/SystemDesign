package model;

public class Question {
    private String QuestionItem;
    private int QuestionItemId;
    private int UserId;


    public void question(){

    }
     public Question(String QuestionItem,int QuestionItemId,int UserId){
        this.QuestionItem = QuestionItem;
        this.QuestionItemId = QuestionItemId;
        this.UserId = UserId;
     }

    public int getQuestionItemId() {
        return QuestionItemId;
    }

    public void setQuestionItemId(int QuestionItemId) {
        this.QuestionItemId = QuestionItemId;
    }

    public String getQuestionItem() {
        return QuestionItem;
    }

    public void setQuestionItem(String QuestionItem) {
        this.QuestionItem = QuestionItem;
    }

    public int getUserId(){
        return UserId;
    }

    public void setUserId(int UserId){
        this.UserId = UserId;
    }

}
