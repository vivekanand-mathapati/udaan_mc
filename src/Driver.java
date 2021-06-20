import constants.Mcq;
import entities.Options;
import entities.Question;
import entities.QuestionBank;

public class Driver {

    public static void main(String[] args) {
        QuestionBank questionBank1 = new QuestionBank();
        questionBank1.addQuestion(new Question("who is our PM",
                new Options("abc", "cde", "efg", "xyg"), Mcq.A));
        questionBank1.addQuestion(new Question("who is our CM",
                new Options("abc", "cde", "efg", "xyg"), Mcq.A));
        questionBank1.addQuestion(new Question("who is our HM",
                new Options("abc", "cde", "efg", "xyg"), Mcq.A));

        questionBank1.getQuestions().forEach(
                x -> {System.out.println(x.getQuestion());}
        );
    }
}



/*

1. question <100>
    mcq <A, B, C, D>
2. quizes
3. try & pagination
    retry
        1. A - 5, 5, 10
        2. A - rpeated + new questions
4. save response
    1. quiz, question and ansers

output


Pagination
1.

*/