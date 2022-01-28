import java.util.ArrayList;

public abstract class Question {
    protected String prompt;
    protected String correctAnswer;
    protected ArrayList<String> answersToPresent = new ArrayList<>();

    public void DisplayQuestion() {
        System.out.println(prompt);
        System.out.println("");

        for (int i = 0; i < answersToPresent.size(); i++) {
            System.out.println(answersToPresent.get(i));
        }
        System.out.println("");
    }
}
