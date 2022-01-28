public class QuizRunner {
    public static void main(String[] args) {
        Quiz quiz = new Quiz();
        quiz.GenerateQuestions();
        quiz.run();
    }
}
