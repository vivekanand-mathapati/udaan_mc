package entities;

import java.util.ArrayList;
import java.util.List;

public class QuestionBank {
    private static int id;
    private String QuestionBankId;
    List<Question> questions;

    public QuestionBank() {
        this.id += 1;
        QuestionBankId = String.format("qbank_%d", this.id);
        questions = new ArrayList<>();
    }

    public String getQuestionBankId() {
        return QuestionBankId;
    }

    public List<Question> getQuestions() {
        return questions;
    }

    public void addQuestion(Question question) {
        this.questions.add(question);
    }
}
