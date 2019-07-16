package model;

public class Answer {

    private String AnswerContent;
    private int RespondentId;
    private int QuestionItemId;
    private int AnswerRank;

    public void answer(){

    }

    public Answer(int RespondentId, String AnswerContent,int AnswerRank,int QuestionItemId){
        this.AnswerContent = AnswerContent;
        this.QuestionItemId = QuestionItemId;
        this.RespondentId = RespondentId;
        this.AnswerRank = AnswerRank;
    }

    public int getRespondentId(){
        return this.RespondentId;
    }

    public int getQuestionItemId(){
        return QuestionItemId;
    }

    public String getAnswerContent(){
        return this.AnswerContent;
    }

    public int getAnswerRank(){
        return this.AnswerRank;
    }

    public void setAnswerContent(String AnswerContent) {
        this.AnswerContent = AnswerContent;
    }

    public void setRespondentId(int RespondentId) {
        this.RespondentId = RespondentId;
    }

    public void setQuestionItemId(int QuestionItemId) {
        this.QuestionItemId = QuestionItemId;
    }

    public void setAnswerRank(int AnswerRank){
        this.AnswerRank = AnswerRank;
    }
}
