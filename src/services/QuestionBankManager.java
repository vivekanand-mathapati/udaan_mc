package services;

public class QuestionBankManager {
    private static QuestionBankManager ourInstance = new QuestionBankManager();

    public static QuestionBankManager getInstance() {
        return ourInstance;
    }

    private QuestionBankManager() {
    }
}
