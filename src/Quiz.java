import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Quiz {
    Scanner input = new Scanner(System.in);
    private ArrayList<Question> questions = new ArrayList<Question>();
    private ArrayList<String> answers = new ArrayList<String>();

    public void GenerateQuestions() {

        questions.add(new CheckBox("What are types of drinks?", "water, milk, beer", new ArrayList<String>(Arrays.asList("water", "milk", "shoe", "beer"))));
        questions.add(new TrueFalse("The sky is blue. (true/false)", "true", new ArrayList<String>()));
        questions.add(new MultipleChoice("Which of these are orange?", "orange", new ArrayList<String>(Arrays.asList("orange", "water", "a quarter"))));
    }

    public String GetUserInput() {
        return input.nextLine();
    }

    public void run() {
        System.out.println("If a question has multiple correct answers, please format them as a, b, c... in the order they are presented.");
        for (int i = 0; i < questions.size(); i++) {
            questions.get(i).DisplayQuestion();
            answers.add(GetUserInput());
        }
        System.out.println("You've scored " + calculateGrade() + "%.");
    }

    private double calculateGrade() {
        double numCorrect = 0;
        double numTotal = questions.size();
        for (int i = 0; i < questions.size(); i++) {
            if (answers.get(i).equals(questions.get(i).correctAnswer)) {
                numCorrect++;
            }
        }
        return (numCorrect / numTotal) * 100;
    }
}
