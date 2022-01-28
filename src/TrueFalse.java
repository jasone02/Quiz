import java.util.ArrayList;

public class TrueFalse extends Question {

    public TrueFalse(String prompt, String correctAnswer, ArrayList<String> answersToPresent) {
        this.prompt = prompt;
        this.correctAnswer = correctAnswer;
        answersToPresent.add(0, "true");
        answersToPresent.add(1, "false");
    }
}
