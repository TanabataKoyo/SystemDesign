package model;

public class Answer {

    private String AnswerContent;
    private int RespondentId;
    private int QuestionId;
    private int AnswerRank;

    public void answer(){

    }

    public Answer(int RespondentId, String AnswerContent,int AnswerRank){
        this.AnswerContent = AnswerContent;
        this.QuestionId = QuestionId;
        this.RespondentId = RespondentId;
        this.AnswerRank = AnswerRank;
    }

    public int getRespondentId(){
        return this.RespondentId;
    }

    public int getQuestionId(){
        return QuestionId;
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

    public void setQuestionId(int QuestionId) {
        this.QuestionId = QuestionId;
    }

    public void setAnswerRank(int AnswerRank){
        this.AnswerRank = AnswerRank;
    }
}
