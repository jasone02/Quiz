import java.util.ArrayList;

public class CheckBox extends Question {

    public CheckBox(String prompt, String correctAnswer, ArrayList<String> answersToPresent) {
        this.prompt = prompt;
        this.correctAnswer = correctAnswer;
        this.answersToPresent = answersToPresent;
    }
}
