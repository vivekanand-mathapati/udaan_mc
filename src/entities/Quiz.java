package entities;

import constants.Mcq;

import java.util.HashMap;

public class Quiz {
    private String quizId;
    HashMap<String, Mcq> questionAnsers;
    User user;

    public Quiz(String quizId) {
        this.quizId = quizId;
        this.questionAnsers = new HashMap<>();
    }

    public String getQuizId() {
        return quizId;
    }

    public void setQuizId(String quizId) {
        this.quizId = quizId;
    }

    public HashMap<String, Mcq> getQuestionAnsers() {
        return questionAnsers;
    }

    public void setQuestionAnsers(String questionId, Mcq answer) {
        questionAnsers.put(questionId, answer);
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
