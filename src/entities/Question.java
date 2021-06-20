package entities;

import constants.Mcq;

public class Question {
    private static int id;
    private String questionId;
    private String question;
    private Options options;
    private Mcq answer;

    public Question(String question, Options options, Mcq answer) {
        this.id += 1;
        this.questionId = String.format("question_%d", this.id);
        this.question = question;
        this.options = options;
        this.answer = answer;
    }

    public String getQuestionId() {
        return questionId;
    }

    public void setQuestionId(String questionId) {
        this.questionId = questionId;
    }

    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    public Options getOptions() {
        return options;
    }

    public void setOptions(Options options) {
        this.options = options;
    }

    public Mcq getAnswer() {
        return answer;
    }

    public void setAnswer(Mcq answer) {
        this.answer = answer;
    }
}
