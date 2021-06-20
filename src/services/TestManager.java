package services;

import constants.Mcq;
import entities.Question;
import entities.Quiz;
import entities.User;

import java.util.HashMap;

public class TestManager {
    HashMap<String, Quiz> quizMap = new HashMap<>();

    public Quiz createQuiz(String quizId, Question question, User user){
        if(quizMap.containsKey(quizId))
            System.out.println("Error 400: Quiz already exist");
        Quiz quiz = new Quiz(quizId);
        quiz.getQuestionAnsers().put(question.getQuestionId(), Mcq.Defalt);
        quiz.setUser(user);
        quizMap.put(quizId, quiz);
        return quiz;
    }


    public Quiz quizMeta(String quizId, String questionId, Mcq answer){
        Quiz quiz = quizMap.get(quizId);
        quiz.getQuestionAnsers().put(questionId, answer);
        return quiz;
    }

    public Quiz getQuiz(String quizId) {
        return quizMap.get(quizId);
    }


}
