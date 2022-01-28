import java.util.ArrayList;

public class MultipleChoice extends Question {

    public MultipleChoice(String prompt, String correctAnswer, ArrayList<String> answersToPresent) {
        this.prompt = prompt;
        this.correctAnswer = correctAnswer;
        this.answersToPresent = answersToPresent;
    }
}
