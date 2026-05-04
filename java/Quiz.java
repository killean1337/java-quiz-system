import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Quiz {
    private List<Question> questions = new ArrayList<>();
    private int score = 0;

    public void addQuestion(Question question) {
        questions.add(question);
    }

    public void start() {
        Scanner scanner = new Scanner(System.in);

        for (Question q : questions) {
            System.out.println(q.getQuestionText());
            String answer = scanner.nextLine();

            if (q.isCorrect(answer)) {
                score++;
                System.out.println("Correct!\n");
            } else {
                System.out.println("Wrong!\n");
            }
        }

        System.out.println("Quiz finished!");
        System.out.println("Your score: " + score + "/" + questions.size());
    }
}